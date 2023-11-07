public class bike{
    public  int wheels;
    public  String color;
    public  String brand;

    public bike(int pWHeels, String pColor, String pBrand){

    wheels= pWHeels;
    color= pColor;
    brand= pBrand;

    }


    public void display(){

    System.out.println("This bike has "+ wheels+  " wheels.  This bike is " + color + ". This bike is a "+brand);

    }


}
