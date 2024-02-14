public class SwitchCase {
    public static void main(String[] args) {
        int day=1;
        switch (day) {
            case 1,5:{
                System.out.println("Monday");
                System.out.println("Monday");
                System.out.println("Monday");
                System.out.println("Monday");
                System.out.println("Monday");
                System.out.println("Monday");
                }
        
            case 2:
                System.out.println("Tuesday");
                System.out.println("Tuesday");
                break;
        
            case 3:
                System.out.println("Wednesday");
                break;
        
            default:
                System.out.println("No Idea which day it is");
                break;
        }
    }
}
