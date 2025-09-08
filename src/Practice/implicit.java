package Practice;

public class implicit {
        public static void main(String[] args) {
            byte b = 10;
            short s = b;
            int i = s;
            char c = 65;
            int i2 = c;
            long l = i;
            float f = i;
            double d1 = l;
            double d2 = f;

            System.out.println("byte to short: " + s);
            System.out.println("short to int: " + i);
            System.out.println("char to int: " + i2);
            System.out.println("int to long: " + l);
            System.out.println("int to float: " + f);
            System.out.println("long to double: " + d1);
            System.out.println("float to double: " + d2);
        }
    }
