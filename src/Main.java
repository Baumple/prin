import anagram.Anagram;
import calendar.Appointment;
import calendar.AppointmentCalendar;
import calendar.Date;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        var calendar = new AppointmentCalendar();
        var appointments = List.of(
                new Appointment("03.12.2023", "test"),
                new Appointment("03.02.1999", "appointment"),
                new Appointment("09.12.2003", "termin"),
                new Appointment("31.3.2", "test")
        );
        appointments.forEach(calendar::addAppointment);
        calendar.showAllAppointments();

        calendar.isAppointmentAtDate(new Date("03.12.2023"));

    }
}