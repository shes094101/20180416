import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        ArrayList<Shape> x=new ArrayList<>();
        x.add(new Circle(scn.nextInt()));
        x.add(new Circle(scn.nextInt()));
        x.add(new Circle(scn.nextInt()));
        x.add(new Rectangle(scn.nextInt(),scn.nextInt()));
        x.add(new Rectangle(scn.nextInt(),scn.nextInt()));
        x.add(new Rectangle(scn.nextInt(),scn.nextInt()));
        x.add(new Triangle(scn.nextInt(),scn.nextInt(),scn.nextInt()));
        x.add(new Triangle(scn.nextInt(),scn.nextInt(),scn.nextInt()));
        x.add(new Triangle(scn.nextInt(),scn.nextInt(),scn.nextInt()));
        Shape shape =x.get(0);
        Shape shape1 =x.get(1);
        Shape shape2 =x.get(2);
        shape.show();
        shape1.show();
        shape2.show();
        Shape shape3 =x.get(3);
        Shape shape4 =x.get(4);
        Shape shape5 =x.get(5);
        shape3.show();
        shape4.show();
        shape5.show();
        Shape shape6 =x.get(6);
        Shape shape7 =x.get(7);
        Shape shape8 =x.get(8);
        shape6.show();
        shape7.show();
        shape8.show();
    }

    }