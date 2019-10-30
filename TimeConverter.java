import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Seconds Since Unix Epoch:");
        Scanner scan = new Scanner(System.in);
        int Input = scan.nextInt();
        int Years01 = 1970;
        int YearChanges = Input / 31104000;
        int Years02 = YearChanges + Years01;
        System.out.println("Year: " + Years02);
        int Extra01 = Input - (YearChanges *31104000);
        int Month01 = Extra01 / 2592000;
        System.out.println("Month: " + Month01);
        int Extra02 = Extra01 - (Month01 * 2592000);
        int Day01 = Extra02 / 86400;
        System.out.println("Day: " + Day01);
        int Extra03 = Extra02 - (Day01 * 86400);
        int Hour01 = Extra03 / 3600;
        System.out.println("Hour: " + Hour01);
        int Extra04 = Extra03 - (Hour01 * 3600);
        int Min01 = Extra04 / 60;
        System.out.println("Min: " + Min01);
        int Extra05 = Extra04 - (Min01 * 60);
        System.out.println("Sec: " + Extra05);
    }
}
