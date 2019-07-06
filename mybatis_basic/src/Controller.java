import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Controller {
    InputStream inputStream;

    {
        try {
            inputStream = Resources.getResourceAsStream("resource/config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlsession = sqlSessionFactory.openSession();

     List<Twebsites> c=  sqlsession.selectList("getWebsiteById");




    @FXML
    public Button bu_1;
    @FXML
    public TextField text_2;
    @FXML
    public TextField text_1;

    @FXML
    private TableView<Twebsites> table;

    @FXML
    private TableColumn<Twebsites,String> num;
    @FXML
    private TableColumn<Twebsites,String> name;
    @FXML
    private TableColumn<Twebsites,String> zubie;
    @FXML
    private TableColumn<Twebsites,String> shiduan;
    @FXML
    private TableColumn<Twebsites,String> danshuangzhou;
    @FXML
    private TableColumn<Twebsites,String> xingqi;


    public void action(){

        ObservableList<Twebsites> cellData = FXCollections.observableArrayList();
        cellData.addAll(c);
        num.setCellValueFactory(cellData1 -> cellData1.getValue().学号Property());
        name.setCellValueFactory(cellData1 -> cellData1.getValue().姓名Property());
        zubie.setCellValueFactory(cellData1 -> cellData1.getValue().组别Property());
        shiduan.setCellValueFactory(cellData1 -> cellData1.getValue().时段Property());
        danshuangzhou.setCellValueFactory(cellData1 -> cellData1.getValue().单双周Property());
        xingqi.setCellValueFactory(cellData1 -> cellData1.getValue().星期Property());


        table.setItems(cellData);




    }
    public void action_2(){

    }

}
