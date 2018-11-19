// reference: https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm

public class Lambda {

        public static void main (String args []) {

            //with type declaration
            MathOperation addition = (int a, int b) -> a + b;

            //with out type declaration
            MathOperation subtraction = (a, b) -> a - b;

            //with return statement along with curly braces
            MathOperation multiplication = (int a, int b) -> {return a * b; };

            //without return statement and without curly braces
            MathOperation division = (int a, int b) -> a / b;

            //three operations
            MathOperation newOperation = (a, b) -> (a+b*a);

            Lambda tester = new Lambda();
            System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
            System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
            System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
            System.out.println("10 / 5 = " + tester.operate(10, 5, division));
            System.out.println("10 + 5 * 10 = " + tester.operate(10, 5, newOperation));

            //Old school method
            GreetingService oldGreetingService = new GreetingService() {
                @Override
                public void sayMessage(String message) {
                    System.out.println("Hello " + message);
                }
            };

            //without parenthesis
            GreetingService greetingService1 = message -> System.out.println("Hello " + message);

            greetingService1.sayMessage("Jesus");
            oldGreetingService.sayMessage("Ti Siang");



    }

    //functional interface
    interface MathOperation {
            int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
            return mathOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
