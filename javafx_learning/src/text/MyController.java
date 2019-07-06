package text;
import mybatis.*;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.text.TabableView;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.PortableInterceptor.USER_EXCEPTION;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MyController  {
	@FXML
	private TableView<User> tableview;
	@FXML
	private TableColumn<User, String> numcolumn;
	@FXML
	private TableColumn<User, String> namecolumn;
	@FXML
	private TableColumn<User, String> typecolumn;
	@FXML
	private TableColumn< User, String> timecolumn;
	@FXML
	private TableColumn<User, String> weekcolumn;
	@FXML
	private TableColumn<User, String> weektimecolumn;
	
	

   
	@FXML
    public void initialize() throws Exception{

        String resource = "mybatis/config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sf.openSession();
        user_interf mapper=session.getMapper(user_interf.class);
        
        List<User> all=mapper.get_all();
        ObservableList<User> data = FXCollections.observableArrayList(all);


        numcolumn.setCellValueFactory(cellData -> cellData.getValue().numProperty());
        namecolumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        typecolumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
        timecolumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        weekcolumn.setCellValueFactory(cellData -> cellData.getValue().weekProperty());
        weektimecolumn.setCellValueFactory(cellData -> cellData.getValue().weektimeProperty());


        tableview.setItems(data);
        session.commit();
       
        session.close();
    }
	private void handle() {
		System.exit(0);
	}
 
  

}