public class Main {
    public static void main(String[] args) {
//        Point point = new Point();
//        System.out.println(point);
//        Point point1 = new Point(5,6);
//        System.out.println(point1);

        MovablePoint m = new MovablePoint(5,6,7,8);
        System.out.println(m.move());
    }
}
