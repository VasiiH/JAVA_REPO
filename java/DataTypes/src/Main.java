public class Main {
    public static void main(String[] args) {
        // byte
        //8 bits (1 byte)
        byte maxByte = 127;
        byte minByte = -128;
        byte i =(byte) (maxByte/2);// casting
        System.out.println(i);

        //short
        //16 bits (2 bytes)
        short minShort = -32768;
        short maxShort = 32767;
        short j = (short) (maxShort/2);// casting
        System.out.println(j);

        // integer (4 bytes)
        //32 bits
        int maxInt= 2_147_483_647;
        int minInt= -2_147_483_648;
        System.out.println(minInt/2);

        // long (8 bytes)
        //64 bits
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        long k = maxLong/2;// here no casting needed
        System.out.println(k);

        long longTotal = 20000L + 4000L * (maxByte+maxInt+maxShort);
        System.out.println("long : "+ longTotal);

        short shortTotal =(short) (200 + 3 * (maxByte));
        System.out.println("short : "+ shortTotal);

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        //
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185
        double pi = 3_000_000.1415927d;
    }
}