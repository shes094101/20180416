public class Circle extends Shape implements Measure{
    public Circle(int radious){
        r=radious;
    }

    @Override
    public void area() {
        area=r*r*Pi;
    }

    @Override
    public void show() {
        System.out.println(area);
    }
}
