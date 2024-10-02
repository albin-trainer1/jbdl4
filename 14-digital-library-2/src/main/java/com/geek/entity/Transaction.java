package com.geek.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
public class Transaction {
private int transactionId;
private LocalDate borrowDate;
private LocalDate returnedDate;
private String status;

private User user; 
private Book book;
private Penalty penalty;
}
