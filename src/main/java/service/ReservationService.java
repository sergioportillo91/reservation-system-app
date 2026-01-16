package service;

import model.Reservation;
import repository.ReservationRepository;

public class ReservationService {

    private final ReservationRepository repository;
    private final NotificationService notificationService;

    public ReservationService(
            ReservationRepository repository,
            NotificationService notificationService
    ) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void createReservation(Reservation reservation) {
        repository.save(reservation);
        notificationService.notify(
                "Reserva creada para el cliente " +
                        reservation.getCustomer().getEmail()
        );
    }

    public void cancelReservation(Long reservationId) {
        repository.deleteById(reservationId);
        notificationService.notify("Reserva cancelada");
    }
}
