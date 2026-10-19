package test;
import java.util.Scanner;
public class Module4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Date (yyyy-mm-dd): ");
        String userInput = scan.nextLine().trim();
        if (datecheck(userInput)) {
            System.out.println("Output: Valid");
        } else {
            System.out.println("Output: Invalid");
        }
        scan.close();
    }
    public static boolean datecheck(String dateStr) {
        if (dateStr.length() != 10) {
            return false;
        }
        String[] parts = dateStr.split("-");
        if (parts.length != 3) return false;

        int year, month, day;
        try {
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            day = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        if (month == 2) {
            boolean leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int maxday = leapyear ? 29 : 28;
            if (day > maxday) {
                return false;
            }
        }
        return true;
    }
}
