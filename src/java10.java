public class java10 {
    // Create a MyClass class
  int x;  // Create a class attribute x
  // Create a class constructor for the MyClass class
  public java10() {
    x = 5;  // Set the initial value for the class attribute x to 5
  }
  public static void main(String[] args) {
    // Create an myObj object of class MyClass (This will call the constructor)
    java10 myObj = new java10(); 
    // Print the value of x
    System.out.println(myObj.x);
  }
}
