package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ActorRepositoryService;

@Service
public class ActorServiceImpl implements ActorService {
	
	@Autowired
	ActorRepositoryService actorRepositoryService;
	
	@Override
	public String getActor() {
		return actorRepositoryService.getActorFromDB();
	}

}
