public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Random number: " + getRandom());
        greet("Developer");
    }

    static int getRandom() {
        return (int) (Math.random() * 100);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}
