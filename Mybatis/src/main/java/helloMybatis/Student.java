package helloMybatis;

import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleStringProperty name;
    private SimpleStringProperty number;
    private SimpleStringProperty group;
    private SimpleStringProperty time;
    private SimpleStringProperty sureweek;
    private SimpleStringProperty week;

    private Student(String name,String number,String group,String time,String sureweek,String week){
        this.name = new SimpleStringProperty(name);
        this.number = new SimpleStringProperty(number);
        this.group = new SimpleStringProperty(group);
        this.time = new SimpleStringProperty(time);
        this.sureweek = new SimpleStringProperty(sureweek);
        this.week = new SimpleStringProperty(week);
    }

   /* private Student(){

    }*/

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getNumber() {
        return number.get();
    }

    public SimpleStringProperty numberProperty() {
        return number;
    }

    public void setNumber(String number) {
        this.number.set(number);
    }

    public String getGroup() {
        return group.get();
    }

    public SimpleStringProperty groupProperty() {
        return group;
    }

    public void setGroup(String group) {
        this.group.set(group);
    }

    public String getTime() {
        return time.get();
    }

    public SimpleStringProperty timeProperty() {
        return time;
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public String getSureweek() {
        return sureweek.get();
    }

    public SimpleStringProperty sureweekProperty() {
        return sureweek;
    }

    public void setSureweek(String sureweek) {
        this.sureweek.set(sureweek);
    }

    public String getWeek() {
        return week.get();
    }

    public SimpleStringProperty weekProperty() {
        return week;
    }

    public void setWeek(String week) {
        this.week.set(week);
    }
}
