public class fizzbuzz {
    final static int tope = 101;
    final static int division3 = 3;
    final static int divion5 = 5;
    public static void main(String[] args) {

        for (int i = 1; i < tope; i++) {
            int operacionentre3 = i % division3;
            int operacionentre5 = i % divion5;
            if (operacionentre3 == 0 && operacionentre5 == 0) {
                System.out.println("fizzbuzz");
            }  else if (operacionentre5 == 0) {
                System.out.println("Buzz");
            }else if (operacionentre3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
            
        }
    }
}
