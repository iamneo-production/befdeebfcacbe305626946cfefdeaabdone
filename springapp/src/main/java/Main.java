public class Main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=context.getBean(Student.class);
        System.out.println("Student ID: "+student.getStudentId());
        System.out.println("First Name: "+student.getFirstName());
        System.out.println("Last Name: "+getLastName());
    }
    
}
