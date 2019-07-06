import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Twebsites {
    private final StringProperty 学号;
    private final StringProperty 姓名;
    private final StringProperty 组别;
    private final StringProperty 时段;
    private final StringProperty 单双周;
    private final StringProperty 星期;



    public Twebsites(String 学号,String 姓名,String 组别,String 时段,String 单双周,String 星期) {
        super();
        this.学号 = new SimpleStringProperty(学号);
        this.姓名 = new SimpleStringProperty(姓名);
        this.组别 = new SimpleStringProperty(组别);
        this.时段 = new SimpleStringProperty(时段);
        this.单双周 = new SimpleStringProperty(单双周);
        this.星期 = new SimpleStringProperty(星期);
    }

    public String get学号() {
        return 学号.get();
    }

    public StringProperty 学号Property() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号.set(学号);
    }

    public String get姓名() {
        return 姓名.get();
    }

    public StringProperty 姓名Property() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名.set(姓名);
    }

    public String get组别() {
        return 组别.get();
    }

    public StringProperty 组别Property() {
        return 组别;
    }

    public void set组别(String 组别) {
        this.组别.set(组别);
    }

    public String get时段() {
        return 时段.get();
    }

    public StringProperty 时段Property() {
        return 时段;
    }

    public void set时段(String 时段) {
        this.时段.set(时段);
    }

    public String get单双周() {
        return 单双周.get();
    }

    public StringProperty 单双周Property() {
        return 单双周;
    }

    public void set单双周(String 单双周) {
        this.单双周.set(单双周);
    }

    public String get星期() {
        return 星期.get();
    }

    public StringProperty 星期Property() {
        return 星期;
    }

    public void set星期(String 星期) {
        this.星期.set(星期);
    }

    @Override
    public String toString() {
        return "Twebsites{" +
                "学号=" + 学号 +
                ", 姓名='" + 姓名 + '\'' +
                ", 组别='" + 组别 + '\'' +
                ", 时段='" + 时段 + '\'' +
                ", 单双周='" + 单双周 + '\'' +
                ", 星期=" + 星期 +
                '}'+'\n';
    }
}
