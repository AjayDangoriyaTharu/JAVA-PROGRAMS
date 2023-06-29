public class Copy_Constructor {
      public static void main(String[] args) {
            Main c1 =  new Main(10, 15);

            Main c2 =  new Main(c1);

            Main c3 = c2;

            System.out.println(c3.display());
        }
  
    }
 class Main {
      
          private double x,y;

    public Main(double one , double two){
        x= one;
        y= two;
    }
        Main(Main c){
            System.out.println("Copy the constructor");
            x=c.x;
            y=c.y;

        }
        public String  display() {
            
            return "("+ x +"+"+ y + "i)";

        }
        
    }
