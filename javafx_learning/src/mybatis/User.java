package mybatis;


import javafx.beans.property.SimpleStringProperty;

public class User {
	private SimpleStringProperty num;
	private SimpleStringProperty name;
	private SimpleStringProperty type;
	private SimpleStringProperty time;
	private SimpleStringProperty week;
	private SimpleStringProperty weektime;
	private User(String num,String name,String type,String time,String week,String weektime) {
		this.num=new SimpleStringProperty(num);
		this.name=new SimpleStringProperty(name);
		this.time=new SimpleStringProperty(type);
		this.week=new SimpleStringProperty(week);
		this.weektime=new SimpleStringProperty(weektime);
	}
	public SimpleStringProperty getName() {
		return name;
	}
	public void setName(SimpleStringProperty name) {
		this.name = name;
	}
	public SimpleStringProperty getNum() {
		return num;
	}
	public void setNum(SimpleStringProperty num) {
		this.num = num;
	}
	public SimpleStringProperty getTime() {
		return time;
	}
	public void setTime(SimpleStringProperty time) {
		this.time = time;
	}
	public SimpleStringProperty getType() {
		return type;
	}public void setType(SimpleStringProperty type) {
		this.type = type;
	}
	public SimpleStringProperty getWeek() {
		return week;
	}
	public void setWeek(SimpleStringProperty week) {
		this.week = week;
	}
	public SimpleStringProperty getWeektime() {
		return weektime;
	}
	public void setWeektime(SimpleStringProperty weektime) {
		this.weektime = weektime;
	}
	
}