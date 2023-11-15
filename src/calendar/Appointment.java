package calendar;

@SuppressWarnings("unused")
public class Appointment {
    private Date date;

    private String description;

    public Appointment(Date date, String description) {
        this.date = date;
        this.description = description;
    }

    public Appointment(String date, String description) throws IllegalArgumentException {
        this.date = new Date(date);
        this.description = description;
    }

    // Aufgabe sagt void?
    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.date.toString(), this.description);
    }
}
