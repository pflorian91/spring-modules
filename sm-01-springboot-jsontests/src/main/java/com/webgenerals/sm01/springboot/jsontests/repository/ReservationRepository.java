package com.webgenerals.sm01.springboot.jsontests.repository;

import com.webgenerals.sm01.springboot.jsontests.ds.Reservation;
import com.webgenerals.sm01.springboot.jsontests.ds.Room;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface ReservationRepository extends CrudRepository<Reservation, UUID> {

	List<Reservation> findAll();

	Set<Reservation> findAllByReservationDate(LocalDate reservationDate);

	boolean existsByRoomAndReservationDate(Room room, LocalDate reservationDate);
}
