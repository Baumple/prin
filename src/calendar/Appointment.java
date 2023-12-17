package calendar;

import jdk.jshell.spi.ExecutionControl;

import static jdk.jshell.spi.ExecutionControl.*;

@SuppressWarnings("unused")
public class Appointment {
    private final Date dateStart;
    private final Date dateEnd;

    private final String description;

    public Appointment(Date date, String description) {
        this.dateStart = date;
        this.dateEnd = date;
        this.description = description;
    }

    public Appointment(Date dateStart, Date dateEnd, String description) throws IllegalArgumentException {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.description = description;
    }

    // Aufgabe sagt void?
    public Date getDate() {
        return dateStart;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        System.err.println("not implemented");
        System.exit(1);
        return String.format("%s: %s", this.dateStart.toString(), this.description);
    }

    // TODO: Check if a given appointment is within a time span.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Appointment appointment) {
        }
        return false;
    }

}
