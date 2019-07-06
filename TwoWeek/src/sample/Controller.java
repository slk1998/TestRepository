package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Controller {
    public Button showAll;
    public Button submit;

    @FXML
    public TableColumn<User, String> studentNumber;
    @FXML
    public TableColumn<User, String> name;
    @FXML
    public TableColumn<User, String> group;
    @FXML
    public TableColumn<User, String> timeZone;
    @FXML
    public TableColumn<User, String> week;
    @FXML
    public TableColumn<User, String> day;
    public Label dataUpdated;
    @FXML
    private TableView<User> table;

    private ObservableList<User> list;
    private Mybatis ms;

    private void initialize() throws IOException {
    }

    public static List<User> nullToEmpty(List<User> list) {
        if (list != null && !list.isEmpty()) {
            for (User user : list) {
                if (user.getName() == null) {
                    user.setName("");
                }
                if (user.getStudentNumber() == null) {
                    user.setStudentNumber("");
                }
                if (user.getDay() == null) {
                    user.setDay("");
                }
                if (user.getGroup() == null) {
                    user.setGroup("");
                }
                if (user.getTimeZone() == null) {
                    user.setTimeZone("");
                }
                if (user.getWeek() == null) {
                    user.setWeek("");
                }
            }
        }
        return list;
    }

    public void initDataUpdated() {
        dataUpdated.setVisible(false);
    }

    public void show() throws IOException {
        dataUpdated.setVisible(false);
        list = FXCollections.observableArrayList();
        ms = new Mybatis();
        List<User> user = ms.findAll();
        user = nullToEmpty(user);
        list.addAll(user);


        studentNumber.setCellValueFactory(new PropertyValueFactory<>("studentNumber"));
        studentNumber.setCellFactory(TextFieldTableCell.forTableColumn());
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        group.setCellValueFactory(new PropertyValueFactory<>("group"));
        group.setCellFactory(TextFieldTableCell.forTableColumn());
        timeZone.setCellValueFactory(new PropertyValueFactory<>("timeZone"));
        timeZone.setCellFactory(TextFieldTableCell.forTableColumn());
        week.setCellValueFactory(new PropertyValueFactory<>("week"));
        week.setCellFactory(TextFieldTableCell.forTableColumn());
        day.setCellValueFactory(new PropertyValueFactory<>("day"));
        day.setCellFactory(TextFieldTableCell.forTableColumn());


        table.setItems(list);
    }

    public void submit(ActionEvent actionEvent) throws IOException {
        list = table.getItems();
        ms.deleteAll();
        ms.insertAll(list);
        dataUpdated.setVisible(true);
    }
}
