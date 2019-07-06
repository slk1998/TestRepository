package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private  StringProperty studentNumber;
    private  StringProperty name;
    private  StringProperty group;
    private  StringProperty timeZone;
    private  StringProperty week;
    private  StringProperty day;

    public User() {
        this(null, null, null, null, null, null);
    }

    User(String studentNumber, String name, String group, String timeZone, String week, String day) {
        this.studentNumber = new SimpleStringProperty(studentNumber);
        this.name = new SimpleStringProperty(name);
        this.group = new SimpleStringProperty(group);
        this.timeZone = new SimpleStringProperty(timeZone);
        this.week = new SimpleStringProperty(week);
        this.day = new SimpleStringProperty(day);
    }

    String getStudentNumber() {
        return studentNumber.get();
    }

    public StringProperty studentNumberProperty() {
        return studentNumber;
    }

    void setStudentNumber(String studentNumber) {
        this.studentNumber.set(studentNumber);
    }

    String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    void setName(String name) {
        this.name.set(name);
    }

    String getGroup() {
        return group.get();
    }

    public StringProperty groupProperty() {
        return group;
    }

    void setGroup(String group) {
        this.group.set(group);
    }

    public String getTimeZone() {
        return timeZone.get();
    }

    public StringProperty timeZoneProperty() {
        return timeZone;
    }

    void setTimeZone(String timeZone) {
        this.timeZone.set(timeZone);
    }

    String getWeek() {
        return week.get();
    }

    public StringProperty weekProperty() {
        return week;
    }

    void setWeek(String week) {
        this.week.set(week);
    }

    String getDay() {
        return day.get();
    }

    public StringProperty dayProperty() {
        return day;
    }

    void setDay(String day) {
        this.day.set(day);
    }
}
