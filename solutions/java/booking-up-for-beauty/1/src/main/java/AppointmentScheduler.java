import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {

        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);

    }

    public boolean hasPassed(LocalDateTime appointmentDate) {

        LocalDateTime current = LocalDateTime.now();
        return appointmentDate.isBefore(current);

    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {

        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {

        DateTimeFormatter dayMonthYear = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,");
        String dayMonthYearFormatted = dayMonthYear.format(appointmentDate);

        DateTimeFormatter minutes = DateTimeFormatter.ofPattern("h:mm a.");
        String minutesFormatted = minutes.format(appointmentDate);

        return "You have an appointment on " + dayMonthYearFormatted + " at " + minutesFormatted;

    }

    public LocalDate getAnniversaryDate() {

        return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }
}
