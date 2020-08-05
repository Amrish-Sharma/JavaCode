package classcheck;

public class CheckClass {

    public static void main(String args[]) {
        A a1 = new B();
        A a2 = new C();
        a1.m();
        a2.m();

    }

}

class A {
    
    private int x = 0;

    public void m() {
        x = 1;
        System.out.print(x);
    }
}

class B extends A {
    private int y = 0;

    @Override
    public void m() {
        y = 2;
        System.out.print(y);
    }
}

class C extends A {

    private int z = 0;

    @Override
    public void m() {
        z = 3;
        System.out.println("Called inside C"+z);
        super.m();
    }
}