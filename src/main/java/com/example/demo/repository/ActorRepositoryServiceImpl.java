package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorRepositoryServiceImpl implements ActorRepositoryService {

	@Autowired
	ActorRepository actorRepository;
	
	@Override
	public String getActorFromDB() {
		return actorRepository.findActorNameWithCustomQuery();
	}

}
