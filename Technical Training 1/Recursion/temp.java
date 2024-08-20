package Recursion;

public class temp  
{  
public static void main(String args[])   
{  
//defining a number of type double   
double num = 10.98765432167;  
System.out.println("Double Number: " + num);  
//use either of the following two statements for two decimal places both gives the same result  
System.out.println("Double Number: " + String.format("%.2f", num));  
System.out.format("Double Number: %.2f", num);  
}  
}  