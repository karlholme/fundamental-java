package debugging;

public class Debugging {

    private static int number = 1;
    Util util = new Util();

    public int countArea(int heightInCM, int widthInCM, String figureName) {
        int area = -1;
        double area1 = -1;
        if(figureName == "Trangle") {
            area = util.countTringleArea(heightInCM / 10, widthInCM /10);
        } else if(figureName == "Square") {
            area = util.countSqareArea((heightInCM / 100));
        } else if(figureName == "Circle") {
            area1 = util.countCircleArea(widthInCM / 100);
        }

        if(figureName == "Circle") {
            return (int)area1;
        }
        return area;
    }

}
