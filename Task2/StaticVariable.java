package Task18122024;

public class StaticVariable {

    
    static int total = 0;

   
    static void addToTotal(int value) {
        total += value;
    }

    
    static void displayTotal() {
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        addToTotal(5);
        displayTotal();

        addToTotal(15);
        displayTotal();

        addToTotal(20);
        displayTotal();
    }
}


