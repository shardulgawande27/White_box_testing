import java.util.Scanner;

public class WhiteBoxTesting{

   public static void user(){
    System.out.println("User Created");
   }

    static void findMax (int x , int y) {

        if(x>y){
            System.out.println("X is Max");
        }
        else if (y>x){
            System.out.println("Y is Max");
        }
        else{
            System.out.println("Both are equal");
        }

    }


    static void whileTesting (int z){

        int i = 1;
        while (i<= z) {
            System.out.println("This is  Loop testing");
            i++;
        }

    }
    

    static void forLoopTesting (int c){

        for (int i = 0; i <= c; i++) {
            System.out.println("This is  Loop testing");            
        }

    }


    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        // Scanner in2 = new Scanner(System.in);

        int x,y,z,c;

        System.out.println("Enter X: ");
        x = in1.nextInt(); 
        System.out.println("Enter Y: ");
        y = in1.nextInt(); 

        findMax (x,y);

        System.out.println("Enter the value for While loop testing : ");
        z = in1.nextInt();

        whileTesting(z);

        System.out.println("Enter the value for For Loop testing");
        c = in1.nextInt();

        forLoopTesting(c);
    }
}
