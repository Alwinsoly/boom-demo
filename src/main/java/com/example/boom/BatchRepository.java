package com.example.boom;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface  BatchRepository extends CosmosRepository<Batches, String>  {
	
	
}
