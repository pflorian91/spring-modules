package com.webgenerals.sm01.springboot.jsontests.service;

import com.webgenerals.sm01.springboot.jsontests.ds.Guest;
import com.webgenerals.sm01.springboot.jsontests.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestRegistrationService {

	@Autowired
	private GuestRepository guestRepository;

	public Guest registerGuest(Guest guest) {
		if (guest.getId() != null)
			throw new IllegalArgumentException(String.format("Guest [%s] already has ID assigned", guest));

		return guestRepository.save(guest);
	}

	public List<Guest> listGuests() {
		return guestRepository.findAll();
	}
}
