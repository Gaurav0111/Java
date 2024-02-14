package excersice;
public class GreatestOfThree {
    public static void main(String[] args) {
        int a=12,b=13,c=14;
        if (a>b){
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else if(b>a){
            if(a>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
    }
}
