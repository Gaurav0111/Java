import java.util.*;;

public class Assignment1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String companyName = "XYZ Pvt. Ltd";
        final String companyAddress = "Mussorie Road Dehradun, Uttarakhand ";
        final long companyPhoneNumber = 9568265862L;
        final String companyEmailAddress = "adminsupport@xyz.com";
        
        // Earning

        final byte HRAEarning = 50;
        final byte DAEarning = 20;
        final byte TAEarning = 30;
        final byte MAEarning = 25;
        int specialAllowancesEarning = 0;
        final byte otherEarning = 0;
        final byte incentiveEarning = 0;
        final byte bonusEarning = 0;
        final byte overTimePayEarning = 10;
        
        // Deduction
        final byte pfDeduction = 5;
        final byte esiDeduction = 0;
        int salaryAdvanceDeduction = 0;
        final byte tdsDeduction = 0;
        final byte otherDeduction = 0;

        // System.out.println(companyPhoneNumber);
        System.out.println("Welcome");
        
        System.out.println("Please enter your name: ");
        final String  employeeName = scanner.nextLine();
        
        System.out.println("Please enter your address: ");
        final String  employeeAdress = scanner.nextLine();
        
        System.out.println("Please enter your Phone No. : ");
        final long employeePhoneNumber = scanner.nextLong(); 
        scanner.nextLine();
        
        System.out.println("Please enter your Email I'd: ");
        final String  employeeEmailId = scanner.nextLine();
        
        System.out.println("Please enter your basic salary");
        final int  employeeBasicSalary = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Number of days you have done overtime in this month: ");
        final byte overTimeDays = scanner.nextByte();
        scanner.nextLine();
        
        System.out.println("Have you taken salary advance- Y/N: ");
        String salaryString = scanner.next();
        if (salaryString.equalsIgnoreCase("y") ){
                System.err.println("Enter the amount you have taken in advance: ");
                final int salaryAdvance = scanner.nextInt();
                salaryAdvanceDeduction = salaryAdvance/6 ;
        }
        else{
                salaryAdvanceDeduction = 0;
        }

        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t Salary Slip");
        
        System.out.println("\t\t\t\t Company Information");
        System.out.println("Company Name : "+companyName);
        System.out.println("Company Address : "+companyAddress);
        System.out.println("Company Phone No : "+companyPhoneNumber);
        System.out.println("Company Email Address : "+companyEmailAddress);
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\tEmployee Information");
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Address : "+employeeAdress);
        System.out.println("Employee Phone no : "+employeePhoneNumber);
        System.out.println("Employee Email ID : "+employeeEmailId);
        System.out.println("");
        System.out.println("");
        
        
        int hraSalary = (employeeBasicSalary * HRAEarning)/100;
        int daSalary = (employeeBasicSalary * DAEarning)/100;
        int taSalary = (employeeBasicSalary * TAEarning)/100;
        int maSalary = (employeeBasicSalary * MAEarning)/100;
        specialAllowancesEarning = hraSalary + daSalary + taSalary + maSalary;
        int grossSalary = employeeBasicSalary + specialAllowancesEarning;
        
        //  Monthly deduction 
        int pF = (grossSalary*pfDeduction) / 100;
        int annualSalary = grossSalary*12;
        int governmentTax = 0;
        if (annualSalary>700000){
                governmentTax = 10;  
        }
        else if(annualSalary>900000){
                governmentTax = 20;  
        }
        else if(annualSalary>1000000){
                governmentTax = 30;  
        }
        governmentTax = ((annualSalary*governmentTax)/100)/12;
        
        
        System.out.println("Earning \t\t Amount"+"\t\t"+"Deduction \t\t Amount");
        System.out.println("Basic \t\t\t "+bonusEarning+"\t\t"+"Provident Fund  \t "+pF);
        System.out.println("HRA \t\t\t "+hraSalary+"\t\t"+"ESI \t\t\t "+esiDeduction);
        System.out.println("Special Allowance \t "+specialAllowancesEarning+"\t\t"+"Professional tax \t "+governmentTax);
        System.out.println("Gross Salary \t\t "+grossSalary+"\t\t"+"Salary Advance \t\t "+salaryAdvanceDeduction);
        System.out.println("Other Earning \t\t "+otherEarning+"\t\t"+"TDS \t\t\t "+ tdsDeduction);
        System.out.println("Incentive \t\t "+ incentiveEarning+"\t\t"+"Other Deductiont \t "+ otherDeduction);
        System.out.println("Bonus \t\t\t "+ bonusEarning);
        
        int perDayOverTimeSalary = employeeBasicSalary/30;
        System.out.println("Over Tme Pay \t\t "+ perDayOverTimeSalary*overTimeDays);
        
        int totalEarnings = grossSalary+otherEarning+incentiveEarning+bonusEarning+overTimeDays;
        int totalDeduction = pF+esiDeduction+governmentTax+salaryAdvanceDeduction+tdsDeduction+otherDeduction;
        System.out.println("Total Earning \t\t "+ totalEarnings+"\t\t"+"Total Deduction \t"+totalDeduction);
        
        System.out.println("");
        
        System.out.println("Net Pay : \t\t"+(totalEarnings-totalDeduction));
        
        System.out.println("");
        System.out.println("");

        

}
}
