public class  Rectangle extends Shape implements Measure{
    public  Rectangle(int weight,int height){
        w=weight;
        h=height;
    }

    @Override
    public void area() {
        area=w*h;
    }

    @Override
    public void show() {
        System.out.println(area);
    }
}
