package surface;

import helloMybatis.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class infomation{
    public void showWindow() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("secondAplication.fxml"));
        primaryStage.setTitle("人员信息");
        primaryStage.setScene(new Scene(root,800,500));
        primaryStage.show();
    }

    public boolean showStudentEditDialog(Student student){
        try
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(infomation.class.getClassLoader().getResource("StudentEditDialog.fxml"));
            AnchorPane page = (AnchorPane)loader.load();

            Stage stage = new Stage();
            stage.setTitle("编辑信息");
            stage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            stage.setScene(scene);

            StudentEditDialogController controller = loader.getController();
            controller.setDialogStage(stage);
            controller.setStudent(student);

            stage.showAndWait();

            return controller.isOkClicked();
        }
        catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
