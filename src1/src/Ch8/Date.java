package Ch8;// Fig. 8.7: Date.java
// Date class declaration.

public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    private int Days; // variable to store total days prior to adding this.day
    private int totalDays; // total days

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }

        // check if year is a 4 digit integer
        if (String.valueOf(year).length() != 4) {
            throw new IllegalArgumentException("year must be a four digit value");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }


    // add days of the year
    public int totalDays() {
        for (int i = 0; i < month; i++) {
            Days += daysPerMonth[i];
        }
        totalDays = Days + day;
        return totalDays;
    }

    public void nextDay() {
        int counter = 0;
        this.totalDays = daysPerMonth[month];
        while (counter < 40) {
//        for (int i = day; i <= this.totalDays; i++) {
            System.out.printf("Incremented Date %d/%d/%d\n", this.month, this.day, this.year);
//            day++;
            counter++;
            if (day >= this.totalDays) {
                this.month += 1;
                if ( this.month > 12) {
                    this.month = 1;
                    this.year += 1;
                }
                day = 0;
                this.totalDays = daysPerMonth[this.month];
            }
            day++;
        }
    }
}


//(Ex 8.15) (Date Class)
//        Create a "Date" class with the following capabilities:
//        1. output the date in multiple formats:
//        MM/DD/YYYY
//        June 14, 1992
//        DDD YYYY
//
//        2. Use OVERLOADED constructors to create "Date" objects initialized with dates of the formats in part (1).
//        The first cases the constructor should receive THREE INTEGER values.
//        The second case should receive a STRING and TWO INTEGER values
//        The third case should receive TWO INTEGER values, the first represents the day number in the year
