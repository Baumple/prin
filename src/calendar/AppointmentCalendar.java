package calendar;

import java.util.ArrayList;


@SuppressWarnings("unused")
public class AppointmentCalendar {

    final private ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Adds an appointment to the calendar.
     *
     * @param a {@link Appointment} Appointment to be added
     */
    public void addAppointment(Appointment a) {
        this.appointments.add(a);
    }

    /**
     * Prints all appointments
     */
    public void showAllAppointments() {
        this.appointments.stream().filter((appointment) -> appointment.getDate().valid()).map(Appointment::toString).toList().forEach(System.out::println);
    }

    /**
     * Checks whether there is an appointment on the given {@link Date}
     *
     * @param date Date of appointment
     * @return boolean true if an appointment was found and false if it no appointment was found
     */
    public boolean isAppointmentAtDate(Date date) {
        return this.appointments.stream().anyMatch((appointment) -> appointment.getDate().equals(date));
    }

    public boolean isAppointmentAtDate(String date) {
        return isAppointmentAtDate(new Date(date));
    }

    public int getAppointmentCount() {
        return this.appointments.size();
    }

}
