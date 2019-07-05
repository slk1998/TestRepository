package helloMybatis;

import java.util.List;

public interface IStudentDao {
    /**
     * 查询所有
     * @return
     */
     List<Student> getAll();
}
