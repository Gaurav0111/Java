public class NormalCal {
    public static int add(int num_1, int num_2) {
        return num_1 + num_2;
    }

    public static int sub(int num_1, int num_2) {
        return num_1 - num_2;
    }

    public static int mul(int num_1, int num_2) {
        return num_1 * num_2;
    }

    public static int div(int num_1, int num_2) {
        return num_1 / num_2;
    }

    public static void main(String[] args) {
        System.out.println("Addition: "+add(10, 10));
        System.out.println("Subtraction: "+sub(20, 10));
        System.out.println("Multiplication: "+mul(10, 50));
        System.out.println("Division: "+div(100, 10));
    }
}
