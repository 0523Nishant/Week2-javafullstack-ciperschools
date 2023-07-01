import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    // Task : write a program that accepts grocery items
    // from user (5 items)
    // make sure no duplicates are added
    // display the products .

    // arraylist or linkedlist.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList myl = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String item = sc.next();
            if (myl.contains(item)) {
                continue;
            }
            myl.add(item);
        }
        System.out.println(myl);

    }

}
