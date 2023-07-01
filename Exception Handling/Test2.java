import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate() {

        try {

            System.out.println("Enter First Number ");
            n1 = sc.nextInt();
            System.out.println("Enter Second Number ");
            n2 = sc.nextInt();

            if (n2 == 0) {
                // Testing Perspective!!!
                throw new ArithmeticException();
            }
            result = n1 / n2;

        } catch (InputMismatchException ime) {
            System.out.println("IME Detected");
        } catch (ArithmeticException ae) {
            System.out.println("Ae Detected");
        } catch (Exception e) {

            System.out.println("Ouch! Exception Detected!" + e.getMessage());
            e.printStackTrace();
        } finally {

            System.out.println("The Division is " + result);
        }
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }

    // Keywords to Handle Exception

    // 1.1 try : represents/contains code that we think has prbabiity to
    // generate/throw Error at Runtime(exception).
    // 1.2 catch : executes only if any error/Exeption Occurs in Try Block. if There
    // is no exception it will not execute.
    // 1.3 finally : finally block executes irrespective of if any exception is
    // occurring in try block or not.
    // 1.4 throw : it is used to raise execeptions manually!
    // 1.5 throws : temporary fix exception and need to add try catch block
}
