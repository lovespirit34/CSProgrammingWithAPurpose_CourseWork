public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
    // establishes the 1/2 delta values of x and y
        double xDelta = ((x2 - x1)/2);
        double yDelta = ((y2 - y1)/2);
        double havP1 = Math.sin(xDelta) * Math.sin(xDelta);
        double havP2 = Math.cos(x1) * Math.cos(x2) * Math.sin(yDelta) * Math.sin(yDelta);
        // takes the square root of the 2 equation segments
        double squareRoot = Math.sqrt(havP1+havP2);
        // completes the equation with the
        double havGreatCircle = 2 * r * Math.asin(squareRoot);
        // prints the distance in kilometers
        System.out.println(havGreatCircle + " kilometers");

    }
}
