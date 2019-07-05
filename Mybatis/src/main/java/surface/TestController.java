package surface;

import helloMybatis.IStudentDao;
import helloMybatis.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;


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

    @FXML
    public void initialize() throws Exception{

        String resource = "Mybatis-config.xml";
        //将硬盘中的xml变成一个输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //使用流对象创建一个会话工厂
        //充当数据储存源的代理，（工厂模式）
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        //session就是程序员与数据库交互的入口
        SqlSession session = sf.openSession();
        IStudentDao mapper = session.getMapper(IStudentDao.class);
        List<Student> all = mapper.getAll();

        //整了一天才发现需要使用如下代码将Util中的集合转化为FX中的集合，差点崩溃
        ObservableList<Student> data = FXCollections.observableArrayList(all);


        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
        groupColumn.setCellValueFactory(cellData -> cellData.getValue().groupProperty());
        timeColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        sureweekColumn.setCellValueFactory(cellData -> cellData.getValue().sureweekProperty());
        weekColumn.setCellValueFactory(cellData -> cellData.getValue().weekProperty());

        //绑定数据到TableView
        tableView.setItems(data);
        session.commit();
        //关闭会话，释放资源
        session.close();
    }
    @FXML
    private void handleExitButtonAction(){
        System.exit(0);
    }
}