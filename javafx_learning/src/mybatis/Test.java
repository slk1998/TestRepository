package mybatis;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.*;

public class Test {
	@org.junit.Test
	public void get_all() throws Exception{
		String resourse="config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resourse);
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sf.openSession();
		user_interf mapper=session.getMapper(user_interf.class);
		List<User>all=mapper.get_all();
		for(User item:all) {
			System.out.println(item.getName()+"  "+item.getGroup()+" "+item.getNumber()+" "+item.getSureweek()
            +"  "+item.getTime()+"  "+item.getWeek());
		}
		session.commit();
	    session.close();
	}
	

}
