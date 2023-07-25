package Gb.Lesson5.ClassWork.Ex1;

public class Outer {
// ВНУТРЕННИЙ КЛАСС
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(outerValue);
            System.out.println(innerValue);
//            innerMethod();
            outerMethod();
        }
    }
    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//            innerMethod();
//        outerMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
    }

}

//public class Outer {
// ВЛОЖЕННЫЙ КЛАСС
//    public Outer(int outerValue) {
//        this.outerValue = outerValue;
//    }
//
//    public Outer() {
//    }
//
//    static class Inner {
//        int innerValue;
//
//        public Inner(int innerValue) {
//            this.innerValue = innerValue;
//        }
//
//        public void innerMethod() {
//            System.out.println(innerValue);
////            innerMethod();
//        }
//    }
//
//    int outerValue;
//
//    public void outerMethod() {
//        System.out.println(outerValue);
////        System.out.println(innerValue);
////            innerMethod();
////        outerMethod();
//    }
//
//    public static void main(String[] args) {
//        Inner inner = new Inner(10);
//    }
//
//}