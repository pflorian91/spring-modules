package com.webgenerals.sm01.springboot.jsontests.repository;

import com.webgenerals.sm01.springboot.jsontests.ds.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface RoomRepository extends CrudRepository<Room, UUID> {

	Set<Room> findAll();

	Optional<Room> findByName(String name);
}
