package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text Signin;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Signin.setText("登陆失败");
    }
}
