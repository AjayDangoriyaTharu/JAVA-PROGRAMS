public class Destructor01 {
    public static void main(String[] args) {
        Destructor01 de = new Destructor01();
        de.finalize();
        de = null;
        System.gc();
        System.out.println("Inside the  main() Method");
    }
    protected void finalize(){
        System.out.println("Object is destroy by Garbage collector.......");
    }
}
