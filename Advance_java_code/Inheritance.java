class superClass{
    void superClassMethod(){
        System.out.println("Super class Method called");
    } 
}

class baseClass extends superClass {
    void baseClassMethod(){
        System.out.println("Base class method called");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        baseClass bs = new baseClass();
        bs.superClassMethod();
        bs.baseClassMethod();
    }
}
