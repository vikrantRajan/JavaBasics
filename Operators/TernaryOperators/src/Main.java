public class Main {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Hello world! Was Car is true!");
        }


        double one = 20.00;
        double two = 80.00;

        double result = ((one + two) * 100) % 40;
        boolean ans = result == 0 ? true : false;
        if (ans) System.out.println("No remainder... result = " + result);
        else System.out.println("No remainder, result = " + result);
    }
}