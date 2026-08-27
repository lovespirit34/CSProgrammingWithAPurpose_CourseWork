public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //checks all values are positive
        Boolean isPositive = a > 0 && b > 0 && c > 0;
        //checks that the values meet the Pythogrean criteria
        Boolean isPythagorean = a*a + b*b == c*c ||
                a*a == c*c + b*b ||
                b*b == c*c + a*a;
        //Prints if the sides represent a right triangle
        System.out.println(isPythagorean && isPositive);
    }
}
