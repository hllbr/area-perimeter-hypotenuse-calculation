
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //	area of a triangle
        System.out.println("area of a triangle =");

        Scanner scn = new Scanner(System.in);
        System.out.println("base of triangle = ");
        int a = scn.nextInt();
        System.out.println("the height of the triangle : ");
        int b = scn.nextInt();
        
        double result_area = (a*b)/2;
        System.out.println(result_area);
        
        //area of the circle
        System.out.println("area of the circle");
        double pi = 3.14159265359;
        System.out.println("r : ");
        int c = scn.nextInt();
        double result_circle = pi*(c*c);
        
        System.out.println(result_circle);
        //circumference of the circle
        System.out.println("circumference of the circle : ");
        double result_circulc = (2*pi*c);
        System.out.println(result_circulc);
        
        //finding the hypotenuse
        System.out.println("finding the hypotenuse ___!!!");
        
        System.out.println("birinci kenarı giriniz : ");
        int ab = scn.nextInt();
        System.out.println("ikinci kenarı giriniz : ");
        int ba = scn.nextInt();
        double result_finding = Math.sqrt((a*a)+(b*b));
        System.out.println("hypotenuse is " +result_finding);
        //We used the library to get square roots
        
     
        
        
    }
    
}
