package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.domain.Actor;

@RepositoryRestResource
public interface ActorRepository extends JpaRepository<Actor, Long> {

	@Query("select first_name from actor where first_name='NICK' and last_name='STALLONE'")
	String findActorNameWithCustomQuery();
}
