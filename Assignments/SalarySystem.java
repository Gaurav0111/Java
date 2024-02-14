package Assignments;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

public class SalarySystem {
    static ResourceBundle rb;
    static Locale locale; // Member of a class (Class Member Variable) - Bind with a Class
    static void loadBundle(){
        rb = ResourceBundle.getBundle("Assignments/message", locale);
    }

    static String properCase(String name){
            String newName = " ";
            String names[] = name.split(" ");    
        for(int i=0; i<names.length; i++){
            String n = String.valueOf(names[i].charAt(0)).toUpperCase() + names[i].substring(1).toLowerCase();
            newName = newName+n+" ";
            // String val = names[i];
            // char letter = val.charAt(0);  
            // String firstLetter =  String.valueOf(letter).toUpperCase();
            // String remainingName = names[i].substring(1).toLowerCase();
            // String n = firstLetter+remainingName;
            // newName = newName+n+" ";
        }
        return newName;
    } 
    
    static String currencyFormat(double value){
        NumberFormat obj = NumberFormat.getCurrencyInstance(locale);
            return obj.format(value);
    }

    static String dateFormat(){
        Date date = new Date();
        // System.out.println(date);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,locale);
        return df.format(date);
    }

    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("हिंदी के लिए 2 दबाएँ");
        int choice = scanner.nextInt();
        
        if(choice == 1){
            locale = new Locale("en","US");
        
        }
        else if(choice ==2){
            locale =new Locale("hi", "IN");
        }
        else{
            locale = new Locale("en","US");
            System.out.println("Wrong Choice... Taking English as Default");
        }
        loadBundle();
        System.out.println(rb.getString("id.msg"));
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(rb.getString("name.msg"));
        String name = scanner.nextLine();
        System.out.println(rb.getString("salary.msg"));
        double basicSalary = scanner.nextDouble();
        compute(name,basicSalary);
        scanner.close();
    }

    static  void compute(String name,double basicSalary){
        double hra = basicSalary * 0.50;   
        double ma = basicSalary * 0.25;   
        double da = basicSalary * 0.20;   
        double pf = basicSalary * 0.05;   
        double ta = basicSalary * 0.40;
        double gs = basicSalary +hra+da+ta+ma;
        double tax = computeTax(gs);
        double ns = gs-pf-tax;
        print(name,gs,hra, da, ma, ta, pf, tax, ns);
    }

    static double computeTax(double gs){
        double annualSalary = gs*12;
        if(annualSalary>500000 && annualSalary <700000){
            return (annualSalary* 10.0)/12;
        }
        else if(annualSalary>700000 && annualSalary<900000 ){
            return (annualSalary*0.20)/12;
        }
        else if(annualSalary>900000){
            return (annualSalary*0.30)/12;
        }
        else{
            return 0.0;
        }
    }

    static  void print(String name,double gs,double hra, double da, double ma, double ta, double pf, double tax, double ns){
        System.out.println(rb.getString("date.msg")+dateFormat());
        System.out.println("Emp Name: "+name);
        System.out.println( rb.getString("allowances.msg")+"\t Deduction ");
        System.out.println("HRA "+ currencyFormat(hra) +"\t\t PF "+currencyFormat(pf));
        System.out.println("DA "+currencyFormat(da)+"\t\t Tax "+currencyFormat(tax));
        System.out.println("MA "+currencyFormat(ma));
        System.out.println("TA "+currencyFormat(ta));
        System.out.println("GS "+currencyFormat(gs));
        System.out.println("Net pay: "+currencyFormat(ns));
    }

    public static void main(String[] args) {
        input();
}
}