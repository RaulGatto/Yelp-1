package it.polito.tdp.Yelp.model;

import java.time.LocalDate;

public class Review {
	private String reviewId;
	private Business business;  // private String businessId non è ottimale in java
	private User user;			//same, preferiamo l'oggetto direttamente
	private double stars;
	private LocalDate reviewDate;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String reviewText;
	
	
}
