public class circle {
    public int radius;

    public circle (int pRadius){
        radius=pRadius;

    }
    public void getArea(){
        System.out.println("The area of this circle is " + (radius*3.1415));
    }

    public void getCircumference(){
        System.out.println("The circumference of this circle is " + (2*3.1415*radius));
    }

}

