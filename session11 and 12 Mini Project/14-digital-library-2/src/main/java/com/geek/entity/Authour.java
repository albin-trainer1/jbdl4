package com.geek.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
//inverse side
@Entity
@Setter
@Getter
public class Authour {
	@Id
private int authourId;
private String name;
//one to many
@JsonIgnore
@OneToMany(mappedBy = "authour",cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
private List<Book> books;
}
