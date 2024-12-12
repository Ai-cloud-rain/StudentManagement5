package raisetech.StudentManagement5.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement5.data.Student;
import raisetech.StudentManagement5.data.StudentCourse;
import raisetech.StudentManagement5.service.StudentService;

@RestController
public class StudentController {


  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return service.searchStudentList();
  }

  @GetMapping("/studentCourseList")
  public List<StudentCourse> getStudentCourseList() {
    return service.searchStudentCourseList();
  }

  @GetMapping("/ageRange")
  public List<Student> getStudentInAgeRange(
      @RequestParam int minAge,
      @RequestParam int maxAge) {
    return service.searchStudentInAgeRange(minAge, maxAge);
  }
}
