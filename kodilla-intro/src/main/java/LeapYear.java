public class LeapYear {
    public static void main(String[] args) {
        int year = 2036;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 != 0 && year % 400 == 0)){
            System.out.println("Ten rok jest przestępny.");
        } else {
            System.out.println("Ten rok nie jest przestępny.");
        }
    }
}
