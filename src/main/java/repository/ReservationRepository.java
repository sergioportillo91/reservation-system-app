package repository;

import model.Reservation;
import java.util.List;

public interface ReservationRepository {

    void save(Reservation reservation);

    void deleteById(Long id);

    List<Reservation> findAll();
}
