import helloMybatis.IStudentDao;
import helloMybatis.Student;
import javafx.collections.ObservableList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void getAll() throws Exception{
        String resource = "Mybatis-config.xml";
        //将硬盘中的xml变成一个输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //使用流对象创建一个会话工厂
        //充当数据储存源的代理，（工厂模式）
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        //session就是程序员与数据库交互的入口
        SqlSession session = sf.openSession();
        IStudentDao mapper = session.getMapper(IStudentDao.class);
        List<Student> all = mapper.getAll();
        for (Student item:all){
            System.out.println(item.getName()+"  "+item.getGroup()+" "+item.getNumber()+" "+item.getSureweek()
            +"  "+item.getTime()+"  "+item.getWeek());
        }
        session.commit();
        //关闭会话，释放资源
        session.close();
    }

}
