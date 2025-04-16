class course{
    String name="Xyz";
    String course="DevOps";
}
public class student {
    public static void main(String[] args) {
        course c=new course();
        System.out.println("Student Details");
        System.out.println("     Student "+c.name+" choose "+ c.course);
        
    }
}
