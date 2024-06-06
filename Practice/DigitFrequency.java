public class DigitFrequency {
    public static int frequency(int num_1,int num_2,int count){
        if(num_1<=0){
            return count;
        }
        if(num_1%10 == num_2){
            count++;
        }
        return frequency(num_1/10, num_2, count);
    } 
    public static void main(String[] args) {
        int num_1=574555754,num_2=5;
        System.out.println(frequency(num_1, num_2,0));
    }
}
