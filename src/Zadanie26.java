public class Zadanie26 {
    public static void main(String[] args) {
        System.out.println(daysNumber(5));
        System.out.println(daysNumber(2));
        System.out.println(daysNumber(4));
        System.out.println(daysNumber(22));

    }
    static int daysNumber (int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                    return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }
}
