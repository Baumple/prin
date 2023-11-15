package calendar;

import jdk.jfr.Unsigned;

@SuppressWarnings("unused")

public class Date {
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
     * @param date The date in form of dd-mm-yyyy
     */
    public Date(String date) throws IllegalArgumentException {
        var valid = Date.isValidDate(date);
        this.setValid(valid);

        if (!this.valid) return;

        String[] temp = date.split("\\.");
        this.day = Integer.parseInt(temp[0]);
        this.month = Integer.parseInt(temp[1]);
        this.year = Integer.parseInt(temp[2]);

        this.setValid(this.isValid());
    }

    public void setDate(String date) {
        this.setValid(Date.isValidDate(date));

        String[] temp = date.split(":");
        this.day = Integer.parseInt(temp[0]);
        this.month = Integer.parseInt(temp[1]);
        this.year = Integer.parseInt(temp[2]);

    }

    /**
     * Checks if date is constructed properly and given date is valid (since Regex does not check all cases)
     *
     * @return boolean
     */
    private boolean isValid() {
        return (this.day <= 31) && (this.month <= 12);
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
        return String.format("%d.%d.%d", this.getDay(), this.getMonth(), this.getYear());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Date date) {
            return this.getDay() == date.getDay() && this.getMonth() == date.getMonth() && this.getYear() == date.getYear();
        }
        return false;
    }

    private static boolean isValidDate(String date) {
        return date.matches("([0-3]\\d)\\.([0-1]\\d)\\.(\\d{4})");
    }
}
