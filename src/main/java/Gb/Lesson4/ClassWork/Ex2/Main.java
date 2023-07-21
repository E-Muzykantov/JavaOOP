package Gb.Lesson4.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {

        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(1,2,3,4);
        System.out.println("boxWithNumber.avarage() = " + boxWithNumber.avarage());

        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber(1,2,3);
        System.out.println("boxWithNumber.compareAvarge(boxWithNumber2) = " + boxWithNumber.compareAvarge(boxWithNumber2));
    }
}
