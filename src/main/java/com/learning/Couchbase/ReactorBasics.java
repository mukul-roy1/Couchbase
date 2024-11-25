package com.learning.Couchbase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ReactorBasics {
	
	public void tryReactor() {
		//producing stream of data
		Flux<Integer> just = Flux.just(1, 2, 3, 4);
		Mono<Integer> just1 = Mono.just(1);
		
		List<Integer> elements = new ArrayList<>();

		//Subscribing it to emit elements
		//The data won’t start flowing until we subscribe.
		Flux.just(1, 2, 3, 4)
		  .log()
		  .subscribe(elements::add);
		
	for(int i=0;i<elements.size();i++) {
		System.out.println(elements.get(i));
	}
	}
}
