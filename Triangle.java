public class Triangle extends Shape implements Measure{
    public Triangle(int a1,int b1,double ang){
        a=a1;
        b=b1;
        angle=ang;
    }

    @Override
    public void area() {
        area=1/2*a*b*Math.sin(angle);
    }
    @Override
    public void show() {
        System.out.println(area);
    }
}
