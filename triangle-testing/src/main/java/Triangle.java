import java.util.Scanner;
import java.lang.String;
import java.lang.System.*;

class Point{
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;

    static void assignthepoints(){
        System.out.println("input 6 numbers so first two numbers are first ordered pair and second two are 2nd pair and 3rd pair is third ordered pair2");
        Scanner points = new Scanner(System.in);
        a = points.nextInt();
        b = points.nextInt();
        c = points.nextInt();
        d = points.nextInt();
        e = points.nextInt();
        f = points.nextInt();

    }
    static public double Length1(){
        double first = Math.pow(c-a,2);
        double second = Math.pow(d-b,2);
        double Distanceformula = Math.sqrt(first+second);

        return Distanceformula;
    }

    static double Length2(){
        double firsts = Math.pow(e-a,2);
        double seconds = Math.pow(f-b,2);
        double rip = Math.sqrt((firsts + seconds));

        return rip;
    }

    static double Length3(){
        double firstss = Math.pow(e-c,2);
        double secondss = Math.pow(f-d,2);
        double rips = Math.sqrt(firstss + secondss);

        return rips;

    }

}


public class Triangle {

    private static String length1;
    private static String length2;
    private static String length3;

    static public void assignthemtriangles(String q,String w, String e){
        length1 = q;
        length2 = w;
        length3 = e;

    }
    static void getArea(){
        double a = Double.parseDouble(length1);
        double b = Double.parseDouble(length2);
        double c = Double.parseDouble(length3);

        double semiPerimeter = (a+b+c) / 2;
        System.out.println("This is the SemiPerimeter "+semiPerimeter);
        double Hero = Math.sqrt((semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c)));
        System.out.println("This is the Hero's Formula " +Hero);
    }
    static void isTriangle(){

        String kevin = length1 + length2 + length3;
        char[] rip = kevin.toCharArray();
            for(int i = 0; i < kevin.length(); i++)
                if (!Character.isDigit(rip[i]) && rip[i] != '.')
                    System.out.print("you got a letter");
        try{
            float k = Float.parseFloat(length1);
            float b = Float.parseFloat(length2);
            float c = Float.parseFloat(length3);
            if(c > k +b || b > k + c || k > b + c){
                System.out.print("not a triangle");
            }
            else if((k == b && b != c)|| (k == c && c !=b)|| (b == c && c != k))
                System.out.print("isosceles");

            else if(k == b && b == c)
                System.out.print("equilateral triangle");
            else if(((k*k)+(b*b) == (c*c)) || ((b*b)+(c*c) == (k*k)) || ((k*k)+(c*c) == (b*b)))
                System.out.print("Right triangle");

            else if((k!=b && b!=c && c != k))
                System.out.print("Scalene");
        }catch (Exception Ex){
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for Length and two for Points");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Input Three Lengths in the triangle and i will decide if it is a triangle.");
            System.out.println("everytime u define something you will have to restart :)");
            String length11 = sc.next();
            String length22 = sc.next();
            String length33 = sc.next();
            Triangle.assignthemtriangles(length11,length22,length33);
            Triangle.getArea();
            Triangle.isTriangle();
        }
        else if(choice == 2){
            Point.assignthepoints();
            String firstLength = Double.toString(Point.Length1());
            String secondLength = Double.toString(Point.Length2());
            String thirdLength = Double.toString(Point.Length3());
            System.out.println(firstLength);
            System.out.println(secondLength);
            System.out.println(thirdLength);
            Triangle.assignthemtriangles(firstLength,secondLength,thirdLength);
            Triangle.isTriangle();
        }



    }
}



