import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter integer");
            int num = console.nextInt();
        } catch (InputMismatchException d) {
            System.out.println("Input Mismatch");
        }
    }
}