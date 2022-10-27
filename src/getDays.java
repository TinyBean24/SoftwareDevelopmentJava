public class getDays {
    private String month;
    private int Month;
    private int day;
    private int year;
    private int Days;
    private int totalDays;
    private final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31};

    public void getDay(int Month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int Month) {
        this.month = switch(Month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid selection";
        };
    }

    public String getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getTotalDays(int Month, int day) {
        this.Month = Month;
        for(int i = 1; i < this.Month; i++) {
            this.Days += this.daysPerMonth[i];
            this.totalDays = this.Days + this.day;
        }
        return this.totalDays;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap;
        isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeap;
    }
}
