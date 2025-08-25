public class eplicit {

        public static void main(String[] args) {
            double d = 123.4567777777777;
            float f = (float) d;
            long l = (long) d;
            int i = (int) l;
            short s = (short) i;
            byte b = (byte) s;
            char c = (char) i;

            System.out.println("double to float: " + f);
            System.out.println("double to long: " + l);
            System.out.println("long to int: " + i);
            System.out.println("int to short: " + s);
            System.out.println("short to byte: " + b);
            System.out.println("int to char: " + c);
        }
    }


