package com.geek.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

//owning side
@Entity
@Setter
@Getter
public class Book {
	@Id
private int bookId;
private String bookName;
@Enumerated(EnumType.STRING)
private Genre genre;
private float cost;
private int stock;
//many to one
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name="authour_id")
private Authour authour;
 }
