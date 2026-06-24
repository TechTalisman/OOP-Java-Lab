class Apple {
    void show() {
        System.out.println("This is the show method of class Apple.");
    }
}

class Banana extends Apple {
    
    void show() {
        System.out.println("This is the show method of class Banana.");
    }
}

class Cherry extends Apple {
    
    void show() {
        System.out.println("This is the show method of class Cherry.");
    }
}

public class prog3 {
    public static void main(String[] args) {
        Apple ref;

        ref = new Banana();
        ref.show(); 

        ref = new Cherry();
        ref.show(); 

        ref = new Apple();
        ref.show(); 
    }
}

