
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import static javafx.application.Application.launch;

public class TestMybatis extends Application {
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("mycss.css").toExternalForm());
        primaryStage.setTitle("Hello World");

        primaryStage.setScene(scene);
        root.setId("background");
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {


        launch(args);


    }
}
