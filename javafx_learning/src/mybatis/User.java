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
		this.type=new SimpleStringProperty(type);
		this.time=new SimpleStringProperty(time);
		this.week=new SimpleStringProperty(week);
		this.weektime=new SimpleStringProperty(weektime);
	}

	public String getNum() {
		return num.get();
	}

	public SimpleStringProperty numProperty() {
		return num;
	}

	public void setNum(String num) {
		this.num.set(num);
	}

	public String getName() {
		return name.get();
	}

	public SimpleStringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getType() {
		return type.get();
	}

	public SimpleStringProperty typeProperty() {
		return type;
	}

	public void setType(String type) {
		this.type.set(type);
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

	public String getWeek() {
		return week.get();
	}

	public SimpleStringProperty weekProperty() {
		return week;
	}

	public void setWeek(String week) {
		this.week.set(week);
	}

	public String getWeektime() {
		return weektime.get();
	}

	public SimpleStringProperty weektimeProperty() {
		return weektime;
	}

	public void setWeektime(String weektime) {
		this.weektime.set(weektime);
	}
}