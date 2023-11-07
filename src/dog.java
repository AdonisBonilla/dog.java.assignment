public class dog {

    public int age;
    public String size;
    public String name;

    //constructor has the same name as the class
    public dog(int pAge, String pSize, String pName) {
        age = pAge;
        size = pSize;
        name = pName;
        if (age < 10) {
            System.out.println("The dog is young.");
        }
        if (age > 10) {
            System.out.println("The dog is old.");
        }
    }
        public void bark() {

            System.out.println
                    (name + " is eating.");

        }

        public void eat() {
            System.out.println(name + " is barking.");

        }
    }


