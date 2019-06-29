package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button myButton;
    public TextField myTextField;

    public void showDataTime(ActionEvent event) {
        System.out.println("Button Clicked!");

        Date now = new Date();

        DateFormat df = new SimpleDateFormat("yyyy-dd-MM:mm:ss");
        String dataTimeString = df.format(now);

        myTextField.setText(dataTimeString);
    }


}
