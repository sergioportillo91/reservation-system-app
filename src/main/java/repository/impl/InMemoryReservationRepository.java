package repository.impl;

import model.Reservation;
import repository.ReservationRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryReservationRepository implements ReservationRepository {

    private final List<Reservation> storage = new ArrayList<>();

    @Override
    public void save(Reservation reservation) {
        storage.add(reservation);
    }

    @Override
    public void deleteById(Long id) {
        storage.removeIf(r -> r.getId().equals(id));
    }

    @Override
    public List<Reservation> findAll() {
        return new ArrayList<>(storage);
    }
}
