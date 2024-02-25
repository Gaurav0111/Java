interface A{
    void methodA();
}

interface B{
    void methodB();
}

class InterfaceImplementation implements A,B{
    public void methodA(){
        System.out.println("Method A implemented");
    }
    public void methodB(){
        System.out.println("Method B implemented");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        InterfaceImplementation implementation = new InterfaceImplementation();
        implementation.methodA();
        implementation.methodB();

    }
}
