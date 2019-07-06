package surface;

import helloMybatis.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class StudentEditDialogController {
    @FXML
    private TextField numberField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField groupField;
    @FXML
    private TextField timeField;
    @FXML
    private TextField sureweekField;
    @FXML
    private TextField weekField;

    private Student student;
    private  boolean okClicked = false;
    private Stage dialogStage;

    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }

    public void setStudent(Student student){
        this.student = student;
        numberField.setText(student.getNumber());
        nameField.setText(student.getName());
        groupField.setText(student.getGroup());
        timeField.setText(student.getTime());
        sureweekField.setText(student.getSureweek());
        weekField.setText(student.getWeek());
    }

    public boolean isOkClicked(){
        return okClicked;
    }

    @FXML
    private void handleOK(){
        if(isInputVaild()){
            student.setNumber(numberField.getText());
            student.setName(nameField.getText());
            student.setGroup(groupField.getText());
            student.setTime(timeField.getText());
            student.setSureweek(sureweekField.getText());
            student.setWeek(weekField.getText());

            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void handleCancel(){
        dialogStage.close();
    }

    private boolean isInputVaild(){
        String errorMessage = "";

        if(numberField.getText() == null || numberField.getText().length() == 0)
        {
            errorMessage += "没有填写学号!";
        }
        if(nameField.getText() == null || nameField.getText().length() == 0)
        {
            errorMessage += "没有填写姓名!";
        }
        if(groupField.getText() == null || groupField.getText().length() == 0)
        {
            errorMessage += "没有填写组别!";
        }
        if(timeField.getText() == null || timeField.getText().length() == 0)
        {
            errorMessage += "没有填写时间!";
        }
        if(sureweekField.getText() == null || sureweekField.getText().length() == 0)
        {
            errorMessage += "没有填写时段!";
        }
        if(weekField.getText() == null || weekField.getText().length() == 0)
        {
            errorMessage += "没有填写星期!";
        }
        if(errorMessage.length() == 0){
            return true;
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("信息错误");
            alert.setHeaderText("请检查填写的信息");
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }
    }
}
