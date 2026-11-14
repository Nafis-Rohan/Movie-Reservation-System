package com.nafis.movie_reservation;

import org.springframework.boot.SpringApplication;

public class TestMovieReservationApplication {

	public static void main(String[] args) {
		SpringApplication.from(MovieReservationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
