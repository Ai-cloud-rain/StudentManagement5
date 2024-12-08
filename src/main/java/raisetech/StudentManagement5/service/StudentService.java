package raisetech.StudentManagement5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement5.data.Student;
import raisetech.StudentManagement5.data.StudentCourse;
import raisetech.StudentManagement5.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    return repository.searchStudent();
  }

  public List<StudentCourse> searchStudentCourseList() {
    return repository.searchStudentCourse();
  }

}
