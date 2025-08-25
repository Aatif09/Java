package New;

public class StaticBasic {

        static int count = 0;  // static variable
        int ginti = 0;  // Non static variable

        public static void main(String[] args) {
            System.out.println("Initial count: " + StaticBasic.count);
            StaticBasic.count = 10;  // changing value without any object
            System.out.println("Updated count: " + StaticBasic.count);

            StaticBasic sb=new StaticBasic();
            System.out.println("Ginti: " + sb.ginti);
            sb.ginti=110;
            System.out.println("Ginti: " + sb.ginti);
        }
    }

//It simply means there is only one copy of that variable, shared by all instances of the class.