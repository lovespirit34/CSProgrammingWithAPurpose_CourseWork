public class HelloGoodbye {
    public static void main(String[] args) {
       /* String name1 = args[0];
        String name2 = args [1];
        System.out.println("Hello " + name1 + " and " + name2);
        System.out.println("Goodbye " + name2 + " and " + name1);*/
        //same result with fewer lines of code
        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] +".");
    }
}
