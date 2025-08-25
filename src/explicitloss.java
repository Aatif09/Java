public class explicitloss {

        public static void main(String[] args) {

            // 1. int to byte (Data Loss: Range overflow)
            int intVal = 550;
            byte byteVal = (byte) intVal;
            System.out.println("int to byte: " + intVal + " -> " + byteVal);

            // 2. double to int (Data Loss: Precision loss)
            double doubleVal = 123.987;
            int intFromDouble = (int) doubleVal;
            System.out.println("double to int: " + doubleVal + " -> " + intFromDouble);

            // 3. float to long (Data Loss: Precision loss)
            float floatVal = 12345.67f;
            long longFromFloat = (long) floatVal;
            System.out.println("float to long: " + floatVal + " -> " + longFromFloat);

            // 4. long to short (Data Loss: Range overflow)
            long longVal = 32768; // One more than max value of short (32767)
            short shortFromLong = (short) longVal;
            System.out.println("long to short: " + longVal + " -> " + shortFromLong);

            // 5. int to char (Data Loss: Interpreted as Unicode character)
            int intToChar = 65;
            char charFromInt = (char) intToChar;
            System.out.println("int to char: " + intToChar + " -> '" + charFromInt + "'");

            // 6. char to byte (Data Loss: Range mismatch)
            char charVal = 300;
            byte byteFromChar = (byte) charVal;
            System.out.println("char to byte: " + (int) charVal + " -> " + byteFromChar);

            // 7. double to float (Data Loss: Precision truncation)
            double largeDouble = 123456789.123456789;
            float floatFromDouble = (float) largeDouble;
            System.out.println("double to float: " + largeDouble + " -> " + floatFromDouble);

            // 8. float to int (Data Loss: Truncates decimals)
            float f2 = 987.654f;
            int i2 = (int) f2;
            System.out.println("float to int: " + f2 + " -> " + i2); // 987.654 -> 987
        }
    }
