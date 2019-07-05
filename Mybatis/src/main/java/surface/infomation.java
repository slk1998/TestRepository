package surface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class infomation extends Application{
    Stage stage = new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("secondAplication.fxml"));
        primaryStage.setTitle("人员信息");
        primaryStage.setScene(new Scene(root,800,500));
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

    public void showWindow() throws Exception{
        start(stage);
    }
}
