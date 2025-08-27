package Lab.Lab2;

// WAP to create class Number with only one private instance variable as a double primitive type,
// include the following methods isZero(), isPositive(), isNegative( ), isOdd( ),
// isEven( ), isPrime(),isAmstrong() in this class and all above methods should return boolean primitive
// type like for isPositive() should return “Positive = True”.
class P7 {
    private double value;

    P7(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0.0;
    }

    public boolean isPositive() {
        return value > 0.0;
    }

    public boolean isNegative() {
        return value < 0.0;
    }

    private boolean isIntegral() {
        return value == Math.floor(value);
    }

    private boolean isNonNegativeIntegral() {
        return isIntegral() && value >= 0;
    }

    public boolean isOdd() {
        if (!isIntegral()) return false;
        long n = (long) value;
        return n % 2 != 0;
    }

    public boolean isEven() {
        if (!isIntegral()) return false;
        long n = (long) value;
        return n % 2 == 0;
    }

    public boolean isPrime() {
        if (!isIntegral()) return false;
        long n = (long) value;
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Armstrong number (a.k.a. Narcissistic): sum of each digit^numDigits == number
    public boolean isAmstrong() { // kept the method name as requested
        if (!isNonNegativeIntegral()) return false;
        long n = (long) value;

        // handle 0 correctly
        if (n == 0) return true;

        int digits = Long.toString(n).length();
        long sum = 0, temp = n;
        while (temp > 0) {
            int d = (int) (temp % 10);
            sum += Math.round(Math.pow(d, digits));
            temp /= 10;
        }
        return sum == n;
    }

    // Demo
    public static void main(String[] args) {
        P7 num = new P7(153); // try changing this (e.g., 2, -5, 12.5, 0)
        System.out.println("Zero = " + (num.isZero() ? "True" : "False"));
        System.out.println("Positive = " + (num.isPositive() ? "True" : "False"));
        System.out.println("Negative = " + (num.isNegative() ? "True" : "False"));
        System.out.println("Odd = " + (num.isOdd() ? "True" : "False"));
        System.out.println("Even = " + (num.isEven() ? "True" : "False"));
        System.out.println("Prime = " + (num.isPrime() ? "True" : "False"));
        System.out.println("Amstrong = " + (num.isAmstrong() ? "True" : "False"));
    }
}

