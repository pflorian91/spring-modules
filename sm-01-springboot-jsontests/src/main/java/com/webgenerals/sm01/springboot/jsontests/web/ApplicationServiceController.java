package com.webgenerals.sm01.springboot.jsontests.web;

import com.webgenerals.sm01.springboot.jsontests.application.ApplicationService;
import com.webgenerals.sm01.springboot.jsontests.ds.BookingRequest;
import com.webgenerals.sm01.springboot.jsontests.ds.Guest;
import com.webgenerals.sm01.springboot.jsontests.ds.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationServiceController {

	@Autowired
	private ApplicationService applicationService;

	@PutMapping("guests")
	public Guest registerGuest(@RequestBody Guest guest) {
		return applicationService.registerGuest(guest);
	}

	@GetMapping("guests")
	public List<Guest> listGuests() {
		return applicationService.listGuests();
	}

	@PutMapping("bookings")
	public void bookRoom(@RequestBody BookingRequest bookingRequest) {
		applicationService.bookAnyRoomForRegisteredGuest(bookingRequest.getGuest(), bookingRequest.getBookingDate());
	}

	@GetMapping("bookings")
	public List<Reservation> listReservations() {
		return applicationService.listReservations();
	}
}
