package surface;

import helloMybatis.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Menu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Aplication.fxml"));
        primaryStage.setTitle("数据库操作");
        primaryStage.setScene(new Scene(root,800,500));
        primaryStage.show();
    }

}
