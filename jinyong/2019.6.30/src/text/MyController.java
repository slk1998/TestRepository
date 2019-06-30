package text;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

   @FXML
   private Button myButton;

   @FXML
   private TextField input;
   @FXML
   private TextField output;

   @Override
   public void initialize(URL location, ResourceBundle resources) {

       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   public void showDateTime(ActionEvent event) {
       System.out.println("Button Clicked!");

       String copyString=input.getText();
       output.setText(copyString);

   }

}