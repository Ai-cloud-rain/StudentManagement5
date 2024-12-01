package raisetech.StudentManagement5;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class StudentCourse {

  private String id;
  private String studentId;
  private String courseName;
  private LocalDateTime courseStartAt;
  private LocalDateTime courseEndAt;
}
