public class ByteShortIntLong {

    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int Min = " + minInt);
        System.out.println("Int Max = " + maxInt);


        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("MIN = " + minByte);
        System.out.println("MAX = " + maxByte);


        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("MIN = " + minShort);
        System.out.println("MAX = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("MIN = " + minLong);
        System.out.println("MAX = " + maxLong);

        long maxV = 9_223_372_036_854_775_807L;

        // casting , treat it as a byte instead of a default integer
        byte byteVal = (byte) (minByte / 2);
        short shortVal = (short) (minShort / 2);

        byte testByte = 100;
        short testShort = 1000;
        int testInt = 100000;

        long testLong =  50000L + 10L * (testByte + testShort + testInt);
        System.out.println(testLong);
    }
}
