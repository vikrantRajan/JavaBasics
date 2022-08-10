public class FloatDouble {
    
//    public static void main(String[] args) {
//        float minFloat = Float.MIN_VALUE;
//        float maxFloat = Float.MAX_VALUE;
//        System.out.println("Float Max = " + maxFloat);
//        System.out.println("Float Min = " + minFloat);
//
//
//        double minDouble = Double.MIN_VALUE;
//        double maxDouble = Double.MAX_VALUE;
//        System.out.println("Double Max = " + maxDouble);
//        System.out.println("Double Min = " + minDouble);
//
//
//        // declare variables
//
//        int myInt = 5 / 3;
//        // option 1 & 2 for float definition
//        float myFloat =  5f / 3; // OR (float) 5.25f;
//        double myDouble = 5 / 3; // OR 2.33d but you don't need to specify, more precise
//        System.out.println(myInt);
//        System.out.println(myFloat);
//        System.out.println(myDouble);
//    }

    public static void main(String[] args) {
        int pounds = 200;
        double kgPerLb = 0.45359237d;

        double totalKGS = pounds * kgPerLb;
        System.out.println(totalKGS);

    }
}
