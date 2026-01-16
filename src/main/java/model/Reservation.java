package model;

import java.time.LocalDateTime;

public class Reservation {

    private final Long id;
    private final Customer customer;
    private final Service service;
    private final LocalDateTime dateTime;

    public Reservation(Long id, Customer customer, Service service, LocalDateTime dateTime) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }
}
