package Day_8.Zadanie106;

public class Data {
    private int year;
    private int month;
    private int day;
    private final String DEFAULT_SEPARATOR = "-";

    Data(int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public boolean setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
            return true;
        }
        return false;
    }

    public boolean setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
            return true;
        }
        return false;
    }

    public boolean setYear(int year) {
        if (String.valueOf(year).matches("[0-9]{4}")) {
            this.year = year;
            return true;
        }
        return false;
    }

    public void showDate() {
        showDate(DEFAULT_SEPARATOR);
    }

    public void showDate(String separator) {
        System.out.println(getDate(separator));
    }

    private String getDate(String separator) {
        return day + separator + month + separator + year;
    }

    @Override
    public String toString() {
        return getDate(DEFAULT_SEPARATOR);
    }
}

