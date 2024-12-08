package raisetech.StudentManagement5.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.StudentManagement5.data.Student;
import raisetech.StudentManagement5.data.StudentCourse;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM student")
  List<Student> searchStudent();

  @Select("SELECT * FROM student_course")
  List<StudentCourse> searchStudentCourse();

}
