import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
          // comand line argument
        //   String name = args[0];
        //   System.out.println(name);

        //   // System.in
        //   int single = System.in.read(); // will return ascaii value

          // scanner 
          Scanner scanner = new Scanner("hello hey heyhey jl kj ");
          while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
          }
          scanner.close();

          Scanner sc = new Scanner(System.in);
          String name = scanner.nextLine();
          


          // console 
          
          System.out.println("Enter name: ");
          String name1 = System.console().readLine();
          System.out.println("Enter password");
          char [] pwd = System.console().readPassword();
          System.out.println("passwoed: "+new String(pwd));
    }
}
