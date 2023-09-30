public class AppConfig {
    public Student student(){
        Student student=new Student();
        student.setStudentId(1);
        student.setFirstName("John");
        student.setLastName("Doe");
        return student;
    }
    
}
