public class LastWorld {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        return splited[splited.length - 1].length();
    }

    public static void main(String[] args) {

    }
}
