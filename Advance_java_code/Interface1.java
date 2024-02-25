interface printable {
    void print();
}

public class Interface1 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        Interface1 obj = new Interface1();
        obj.print();
    }
}