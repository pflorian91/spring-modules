package com.webgenerals.sm04.springboot1.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "TODO_ITEM")
public class TodoItem {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	private String title;
}
