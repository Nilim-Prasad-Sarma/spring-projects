package com.te.demo;

public class MovieTheatreDemo {
public static void main(String[] args) {
	MovieTheatre tickets = MovieTheatre.bookTickets(10);
	System.out.println(tickets.hashCode());
	
	MovieTheatre bookTickets = MovieTheatre.bookTickets(10);
	System.out.println(bookTickets.hashCode());
}
}
