public class Area {
    public static void main(String[] args) {
        Area1 A1 = new Area1();
        A1.area(5);
        A1.area(8);
        A1.area(5, 8);
        A1.area(5.7, 8);
    }
}
class Area1
{
    void area(double a)
    {
        double c=3.14*a*a;
        System.out.println("Area of the circle is " +c+ "sq units");
    }
    void area(float a)
    {
        System.out.println("Area of the square is " +Math.pow(a,2)+ "sq units");
    }
    void area(float a,float b)
    {
        System.out.println("Area of the rectangle is" +a*b+ "sq units");
    }
    void area(double a,double b)
    {
        System.out.println("Area of the triangle is " +(a+b)/2+ "sq units");
    }

}
