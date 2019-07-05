package surface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    private Text showText;
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passwordField;


    private String admin = "elab";
    private String password = "elab123456";


    @FXML
    protected void handleRegistButtonAction(ActionEvent event){
        showText.setText("该功能暂未开放");
    }

    @FXML
    protected void handleLoginButtonAction(ActionEvent event){
        String typeAdmin = textField.getText();
        String typePassword = passwordField.getText();
        if(typeAdmin.equals(admin) && typePassword.equals(password))
        {
            showText.setText("登陆成功");
            try{
                infomation info = new infomation();
                info.showWindow();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            showText.setText("用户名或密码错误");
        }
    }
}
