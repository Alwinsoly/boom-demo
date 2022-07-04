package com.example.boomnew;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface  BatchRepository extends CosmosRepository<BatchGraph, String>  {
	
	
}

