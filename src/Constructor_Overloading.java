

//Over loading constructor means more the one Constructors
public class Constructor_Overloading {
    
    public static void main(String[] args) {
        Student s1 = new Student(12);
        Student s2 = new Student(18, "Ajay");

        s1.display();
        s2.display();

    }
}

class Student{
    int id;
    String Name;
//Constructor 1
    Student(int stdid , String stdName){
        id = stdid;
        Name = stdName;
        
    }
    //Constructor 1
    Student(int stdid){
        id = stdid;

    }
    void display(){
        System.out.println(id+" "+Name);
    }

}