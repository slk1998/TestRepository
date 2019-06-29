package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {
    //这里的Button对象有需要加@FXML注解，然后变量的名称为你刚才在FXML文件中声明的Button的id属性
    @FXML
    private Text Signin;
    @FXML
    public void Click(MouseEvent mouseEvent) {
        Signin.setText("别点了弱智！");
    }

    public void click(MouseEvent mouseEvent) {
        Signin.setText("这个也没用弱智！");
    }
}