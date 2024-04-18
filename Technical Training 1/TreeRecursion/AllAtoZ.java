package TreeRecursion;

public class AllAtoZ {

    static void aToZ(int n,String result){
        if(result.length() == n){
            System.out.print(result+" ");
            return;
        }
        for(char alpha = 'A'; alpha<= 'Z'; alpha++){
            aToZ(n,result+alpha);
        }
    }

    public static void main(String[] args) {
        aToZ(2,"");
    }
}
