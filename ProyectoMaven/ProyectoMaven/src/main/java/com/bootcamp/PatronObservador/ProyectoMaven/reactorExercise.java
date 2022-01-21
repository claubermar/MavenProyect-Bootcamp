package com.bootcamp.PatronObservador.ProyectoMaven;

import reactor.core.publisher.Flux;

public class reactorExercise {

	public static void main(String[] args) {
		
		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		messageSender.subscribe(message -> System.out.println("Oberserver 1. Received: " + message));
		messageSender.subscribe(message -> System.out.println("Oberserver 2. Received: " + message));
	}

}
