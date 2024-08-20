import java.util.Scanner;
public class Program6{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        final double p = 3.14159;
        System.out.println("Input Radius:");
        double r = s.nextDouble();
        double d = r + r;
        double a = r * r * p;
        double c = p * d;
        String ap = Double.toString(a);
        ap = ap.substring(0,6);
        String cp = Double.toString(c);
        cp = cp.substring(0,6);
        System.out.println("The Radius of the circle = " + r);
        System.out.println("The Diametet of the circle = " + d);
        System.out.println("The Area of the circle = " + ap);
        System.out.println("The Circumference of the circle = " + cp);
    }
}
//Paste console output below:
/*
Input Radius:
3.712
The Radius of the circle = 3.712
The Diametet of the circle = 7.424
The Area of the circle = 43.287
The Circumference of the circle = 23.323
*/
