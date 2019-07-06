package surface;

import helloMybatis.IStudentDao;
import helloMybatis.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;


public class TestController  {
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> numberColumn;
    @FXML
    private TableColumn<Student, String> groupColumn;
    @FXML
    private TableColumn<Student, String> timeColumn;
    @FXML
    private TableColumn<Student, String> sureweekColumn;
    @FXML
    private TableColumn<Student, String> weekColumn;

    infomation info = new infomation();
    ObservableList<Student> data;
    IStudentDao mapper;
    SqlSession session;

    @FXML
    public void initialize() throws Exception{
        String resource = "Mybatis-config.xml";
        //将硬盘中的xml变成一个输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //使用流对象创建一个会话工厂
        //充当数据储存源的代理，（工厂模式）
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        //session就是程序员与数据库交互的入口
        session = sf.openSession();
        mapper = session.getMapper(IStudentDao.class);

        List<Student> all = mapper.getAll();

        //整了一天才发现需要使用如下代码将Util中的集合转化为FX中的集合，差点崩溃
        data = FXCollections.observableArrayList(all);


        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
        groupColumn.setCellValueFactory(cellData -> cellData.getValue().groupProperty());
        timeColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        sureweekColumn.setCellValueFactory(cellData -> cellData.getValue().sureweekProperty());
        weekColumn.setCellValueFactory(cellData -> cellData.getValue().weekProperty());

        //绑定数据到TableView
        tableView.setItems(data);
        session.commit();
    }

    @FXML
    private void handleAddStudent(){
        Student tempStudent = new Student();
        boolean okClicked = info.showStudentEditDialog(tempStudent);
        if(okClicked){
            data.add(tempStudent);
            mapper.insertStudent(tempStudent);
            session.commit();
        }
    }
    @FXML
    private void handleEditStudent(){
        Student selectStudent = tableView.getSelectionModel().getSelectedItem();
        if(selectStudent != null){
            String tempNumber = selectStudent.getNumber();
            info.showStudentEditDialog(selectStudent);
            selectStudent.setNumber(tempNumber);
            mapper.updateStudentById(selectStudent);
            session.commit();
        }
        else
        {
            showAlert();
        }
    }

    @FXML
    private void handleExitButtonAction(){
        System.exit(0);
    }

    @FXML
    private void handleDeleteStudent(){
        int selectIndex = tableView.getSelectionModel().getSelectedIndex();
        if(selectIndex >= 0){
            Student stu = data.get(selectIndex);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("确认");
            alert.setHeaderText("确定删除该条信息吗？");

            Optional result = alert.showAndWait();
            if(result.get() == ButtonType.OK) {
                tableView.getItems().remove(selectIndex);
                mapper.deleteStudent(stu);
                session.commit();
            }
        }
        else
        {
            showAlert();
        }
    }

    private void showAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("错误");
        alert.setHeaderText("没有选择信息");
        alert.setContentText("请选择一条信息!");
        alert.showAndWait();
    }
}