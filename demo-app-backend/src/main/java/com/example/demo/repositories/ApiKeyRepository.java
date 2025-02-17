package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.ApiKey;

public interface ApiKeyRepository extends JpaRepository<ApiKey,Long>{
		@Query(value="select * from api_key limit 1",nativeQuery=true)
		ApiKey findAnyKey();
}
