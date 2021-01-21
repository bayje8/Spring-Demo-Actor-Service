package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ActorService;

@RestController
@RequestMapping(path="/services/v1/actor")
public class ActorController {
	
	@Autowired
	ActorService actorService;

	@RequestMapping(method=RequestMethod.GET, path="/search")
	public String searchActor() {
		return actorService.getActor();
	}
}
