package Practice.Arrayyy;

public class MaximumHeightOfATriangle {
    public static int maxHeightOfTriangle(int red, int blue) {
        int cpyRed = red;
        int cpyBlue = blue;
        int heightBlueFirst = 0;
        while (red >= heightBlueFirst+1 && blue >= heightBlueFirst+1) {
            heightBlueFirst++;
            if (heightBlueFirst % 2 != 0) {
                blue -= heightBlueFirst;
            } else {
                red -= heightBlueFirst;
            }
        }
        if ((heightBlueFirst + 1) % 2 != 0) {
            if (blue >= heightBlueFirst + 1)
                heightBlueFirst++;
        }
        if ((heightBlueFirst + 1) % 2 == 0) {
            if (red >= heightBlueFirst + 1)
                heightBlueFirst++;
        }
        red = cpyRed;
        blue = cpyBlue;
        int heightRedFirst = 0;
        while (red >= heightRedFirst+1 && blue >= heightRedFirst+1) {
            heightRedFirst++;
            if (heightRedFirst % 2 != 0) {
                red -= heightRedFirst;
            } else {
                blue -= heightRedFirst;
            }
        }
        if ((heightRedFirst + 1) % 2 != 0) {
            if (red >= heightRedFirst + 1)
                heightRedFirst++;
        }
        if ((heightRedFirst + 1) % 2 == 0) {
            if (blue >= heightRedFirst + 1)
                heightRedFirst++;
        }
        System.out.println(heightBlueFirst);
        System.out.println(heightRedFirst);
        return heightBlueFirst > heightRedFirst ? heightBlueFirst : heightRedFirst;
    }

    public static void main(String[] args) {
        int red = 9;
        int blue = 3;
        System.out.println(maxHeightOfTriangle(red, blue));
    }
}
