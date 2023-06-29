public class parameter_constructor {
    
public static void main(String[] args) {
    
    Student s1 = new Student(11222780,"Ajay");
    Student s2 = new Student(11222680,"Phabindra");
    s1.display();
    s2.display();
}
}
class Student{

    int id;
    String name;
     Student(int stdid, String stdname) {
        id = stdid;
        name = stdname;


     }
     void display(){
        System.out.println(id);
        
        System.out.println(name);
     }

}
