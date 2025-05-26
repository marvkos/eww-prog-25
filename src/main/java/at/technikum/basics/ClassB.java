package at.technikum.basics;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassB b = new ClassB();

        b.extract("Test");
    }

    @Override
    public void doSomething() {
        System.out.println("This is B");
    }

    public void extract(String test) {
        System.out.println("Test1");
    }

    public void extract(int test) {
        System.out.println("Test2");
    }
}
