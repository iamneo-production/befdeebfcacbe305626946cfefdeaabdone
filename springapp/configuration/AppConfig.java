import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class AppConfig {
    public Student student(){
        Student student=new Student();
        student.setStudentId(1);
        student.setFirstName("Shaurya");
        student.setLastName("Shekhar");
        return student;
    }
    
}
