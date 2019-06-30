package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public Button bu_1;
    @FXML
    public TextField text_2;
    @FXML
    public TextField text_1;
    public void action(){
       String text = text_1.getText();//获取文本框输入的内容
       System.out.println(text);
       text_2.setText(text);

    }
    public void action_2(){

    }

}
