public class LeapYear {
    public static void main(String[] args) {
        int firstYear = 2020;
        int secondYear = 2021;

        System.out.println("first year: "+firstYear);
        System.out.println("second year: "+secondYear);

        if (isLeapYear(firstYear)) {
            System.out.println("First year is leap year");
        } else {
            System.out.println("First year is not leap year");
        }

        if (isLeapYear(secondYear)) {
            System.out.println("Second year is leap year");
        } else {
            System.out.println("Second year is not leap year");
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year%4 == 0 && year%100 != 0) || (year%4 == 0 && year%100 == 0 && year%400 == 0));
    }
}
