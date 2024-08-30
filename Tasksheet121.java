import java.util.Scanner;
import static java.lang.Math.*;

public class Tasksheet121 {
    public static int add(int a, int b){
        return addExact(a, b);
    }
    public static int subb(int a, int b){
        return subtractExact(a, b);
    }
    public static int mull(int a, int b){
        return multiplyExact(a, b);
    }
    public static int divv(int a, int b){
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Imput 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(" ");
        System.out.println("The addition is: "+ add(num1, num2));
        System.out.println("The subtraction is: "+ subb(num1, num2));
        System.out.println("The multiplication is: "+ mull(num1, num2));
        System.out.println("The division is: "+ divv(num1, num2));
        scan.close();
    }
}
