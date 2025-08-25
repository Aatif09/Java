package New;

class AA {
    private int x;
    private static int y;

    void fun1() {
        y = 22;
        x=5;
        System.out.println(x);

    }

    void fun2() {
        System.out.println(y);
        System.out.println(x);
    }

    void fun3() {
        y = 45;
    }
}

class StaticMembers2 {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        a1.fun1();
        a2.fun2();

    }
}
