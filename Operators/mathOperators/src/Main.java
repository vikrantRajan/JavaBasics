public class Main {
    public static void main(String[] args) {

        int add = 1 + 2;
        int subtract = 1 - 2;
        int multiply = 2 * 2;
        double divide = 5 / 4.2;
        int remainder = 10 % 3;
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        // increment / decrement
        add++;
        add += 2;
        System.out.println(add);

        //
        subtract--;
        subtract -= 2;
        System.out.println(subtract);

        multiply *= 3;
        System.out.println(multiply);

        divide /= 3;
        System.out.println(divide);


    }
}