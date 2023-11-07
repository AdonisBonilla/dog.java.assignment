public class student {
    //age, grade, name
    public int age;

    public String name;

    public String grade;

    // a constructor has the same name as the class
//doesn't have a return type (ex. public void)
    public student(int pAge, String pName, String pGrade) {

        age = pAge;
        name = pName;
        grade = pGrade;


    }

    public void display() {
//needs void bc its Not a constructor, it is a method of the class
        System.out.println("His age is"+ age + "His name is" + name + "His grade is a" + grade);
    }


    }

