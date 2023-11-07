public class student {
    //age, grade, name
    public int age;

    public String name;

    // a constructor has the same name as the class
//doesn't have a return type (ex. public void)
    public student(int pAge, String pName) {

        age = pAge;
        name = pName;


    }

    public void getAge() {
//needs void bc its Not a constructor, it is a method of the class
        System.out.println("His age is "+ age);
    }
public void getName(){
   System.out.println( "His name is " + name);
}

    }

