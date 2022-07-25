import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều cao là :");
        width = scanner.nextFloat();
        System.out.println("Chiều rộng là :");
        height = scanner.nextFloat();
        float arena = width*height;
        System.out.println("Chu vi là" + arena);



    }
}
