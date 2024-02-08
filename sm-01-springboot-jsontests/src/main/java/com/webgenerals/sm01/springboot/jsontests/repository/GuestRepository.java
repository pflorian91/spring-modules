package com.webgenerals.sm01.springboot.jsontests.repository;

import com.webgenerals.sm01.springboot.jsontests.ds.Guest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface GuestRepository extends CrudRepository<Guest, UUID> {

	List<Guest> findAll();
}
