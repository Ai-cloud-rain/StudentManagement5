package raisetech.StudentManagement5;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM student")
  List<Student> searchStudent();

  @Select("SELECT * FROM student_course")
  List<StudentCourse> searchStudentCourse();

}
