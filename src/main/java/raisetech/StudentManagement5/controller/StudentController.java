package raisetech.StudentManagement5.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement5.StudentRepository;
import raisetech.StudentManagement5.data.Student;
import raisetech.StudentManagement5.data.StudentCourse;

@RestController
public class StudentController {

  @Autowired
  private StudentRepository repository;


  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return repository.searchStudent();
  }

  @GetMapping("/studentCourseList")
  public List<StudentCourse> getStudentCourseList() {
    return repository.searchStudentCourse();
  }


}
