package Task18122024;

public class instanceVariable {
   
    String name;
    int age;

   
    public instanceVariable(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    void Mymethod() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
    	instanceVariable person1 = new instanceVariable("Yokesh", 21);

        
        person1.Mymethod();
    }
}

