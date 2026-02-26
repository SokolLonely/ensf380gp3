public class App {
    public static void main(String[] args) throws Exception {
       try {
        int x = 5/0;
         } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
       }
    }
}
