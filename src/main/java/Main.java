import model.*;
import repository.ReservationRepository;
import repository.impl.InMemoryReservationRepository;
import service.ConsoleNotificationService;
import service.ReservationService;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Crear dependencias
        ReservationRepository repository = new InMemoryReservationRepository();
        ConsoleNotificationService notificationService = new ConsoleNotificationService();

        // Inyección manual
        ReservationService reservationService = new ReservationService(repository, notificationService);

        // Crear datos
        Customer customer = new Customer(1L, "David Galeano", "david.galeano@mail.com");
        Service service = new Service(1L, "Consulta", 50000);

        Reservation reservation = new Reservation(1L, customer, service, LocalDateTime.now());

        // Usar el sistema
        reservationService.createReservation(reservation);
        reservationService.cancelReservation(1L);
    }
}
