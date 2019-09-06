package debugging;

public class Util {

    public int countTringleArea(int heightInMM, int widthInMM) {
        return heightInMM * widthInMM / 2;
    }

    public int countSqareArea(int heightAndWidthInMM) {
        return heightAndWidthInMM * heightAndWidthInMM;
    }

    public double countCircleArea(int radiusInMM) {
        return radiusInMM * Math.PI;
    }
}
