package String;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAdress {

    public static List<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return list;
        }
        for (int i = 0; i < s.length(); i++) {
            int first, second, third, fourth;
            int length = s.length() / 4;
            
        }

        return list;
    }

    public static void main(String[] args) {

    }
}
