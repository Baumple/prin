package calendar;

import jdk.jfr.Unsigned;

@SuppressWarnings("unused")

public class Date {
    private boolean timeSet = false;
    @Unsigned
    private int hour = 0;
    @Unsigned
    private int minute = 0;

    @Unsigned
    private int day = 0;
    @Unsigned
    private int month = 0;
    @Unsigned
    private int year = 0;
    private boolean valid;

    /**
     * Creates a new Date object.
     *
     * @param date The date in form of HH-mm dd.mm.yyyy
     */
    public Date(String date) throws IllegalArgumentException {
        String[] temp = date.split("\\.");
        this.day = Integer.parseInt(temp[0]);
        this.month = Integer.parseInt(temp[1]);
        this.year = Integer.parseInt(temp[2]);

        this.setValid(this.isValid());
    }

    /**
     * Adds an optional time to the date
     *
     * @param hhmm - HH:mm representation of hours and minutes
     */
    public void addTime(String hhmm) {
        if (hhmm.length() != 5) {
            throw new IllegalArgumentException();
        }
        int hour = Integer.parseInt(hhmm.substring(0, 2));
        int minute = Integer.parseInt(hhmm.substring(3));
        if (hour < 0 || hour > 24 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        }

        this.hour = hour;
        this.minute = minute;
        this.timeSet = true;
    }

    public boolean isTimeSet() {
        return this.timeSet;
    }

    public void setDate(String date) {
        String[] temp = date.split(":");
        this.day = Integer.parseInt(temp[0]);
        this.month = Integer.parseInt(temp[1]);
        this.year = Integer.parseInt(temp[2]);
        this.setValid(this.isValid());

    }

    private static boolean isValidDate(int days, int months, int years) {
        return (0 < days && days <= 31) && (0 < months && months <= 12) && (0 <= years);
    }

    private static boolean isValidTime(int hours, int minutes) {
        return (0 <= hours && hours <= 24) && (0 <= minutes && minutes <= 59);
    }

    /**
     * Checks if date is constructed properly and given date is valid (since Regex does not check all cases)
     *
     * @return boolean
     */
    private boolean isValid() {
        if (0 < this.day && this.day <= 31 && 0 < this.month && this.month <= 12) {
            return true;
        }
        throw new IllegalArgumentException();
    }

    private void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean valid() {
        return this.valid;
    }

    @Override
    public String toString() {
        return String.format("%d:%d %d.%d.%d", this.getHour(), this.getMinute(), this.getDay(), this.getMonth(), this.getYear());
    }

    private int getHour() {
        return this.hour;
    }

    private int getMinute() {
        return this.minute;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Date date) {
            return
                    (this.getHour() == date.getHour())
                            && (this.getMinute() == date.getMinute())
                            && (this.getDay() == date.getDay())
                            && (this.getMonth() == date.getMonth())
                            && (this.getYear() == date.getYear());
        }
        return false;
    }


    @SuppressWarnings("unused")
    private static boolean isValidDateRegex(String date) {
        return date.matches("([0-3]\\d)\\.([0-1]\\d)\\.(\\d{4})");
    }

    public boolean isSameDate(Date date) {
        return this.getDay() == date.getDay() && this.getMonth() == date.getMonth() && this.getYear() == date.getYear();
    }
}
