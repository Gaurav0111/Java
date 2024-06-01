// package Practice;

public class Variable {
    public static void main(String[] args) {
        // primitive/value/primary

        // byte(1byte)
        // short(2 byte)
        // int(4 byte)
        // long(8 byte)
        // float(4 byte)
        // double(8 byte)
        // boolean(1 byte)
        // char(2 byte)
        int num1 = 54;
        int num2 = num1;
        num2 += 1;
        System.out.println(num1);
        // refrence type
        // String data type
        String firstname = "gaurav";
        String lastname = firstname;
        String str2 = new String("qweasd");
        String str1 = new String("qweasd");
        System.out.println(str1 == str2);
        lastname = lastname + "garwal";
        System.out.println(firstname);
        System.out.println(lastname);

        // StringBuffer
        StringBuffer fname = new StringBuffer("Gaurav");
        // StringBuffer strbuffer = "hey";
        StringBuffer lname = fname;
        lname.append("Garwal");
        System.out.println(fname);

        // StringBuilder
    }
}
