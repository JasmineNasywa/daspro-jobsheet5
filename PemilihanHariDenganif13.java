import java.util.Scanner;

public class PemilihanHariDenganif13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int dayName;

        System.out.println("Input day name : ");
        dayName = sc.nextInt();

    if (dayName == 1) {
        System.out.println("weekday");
    }
    else if (dayName == 2) {
        System.out.println("weekday");
    }
    else if (dayName == 3) {
        System.out.println("weekday");
    }
    else if (dayName == 4) {
        System.out.println("weekday");
    }
    else if (dayName == 5) {
        System.out.println("weekday");
    }
    else if (dayName == 6) {
        System.out.println("weekend");
    }
    else if (dayName == 7) {
        System.out.println("weekend");
    }
    else {
        System.out.println("Invalid number");
    }

    }
}

