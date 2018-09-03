package com.coderef.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderef.auth.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}
