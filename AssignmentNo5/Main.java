package AssignmentNo5;
class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void myfunc(int x) throws MySpecialNumberException {
        if (x == 10 || x == 20 || x == 30) {
            throw new MySpecialNumberException("MySpecialNumberException: Input should not be 10, 20, or 30");
        } else {
            System.out.println("myfunc: Input is " + x);
        }
    }

    public static void main(String[] args) {
        int[] inputs = {5, 10, 15, 20, 25, 30};

        for (int input : inputs) {
            try {
                myfunc(input);
            } catch (MySpecialNumberException e) {
                System.err.println("Caught MySpecialNumberException: " + e.getMessage());
            } finally {
                // This block will be executed whether an exception occurs or not
                System.out.println("Finally block executed.");
            }
        }
    }
}

