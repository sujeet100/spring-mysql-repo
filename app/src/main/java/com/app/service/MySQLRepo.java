package com.app.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.domain.User;

@Repository
public interface MySQLRepo extends CrudRepository<User, Integer> {

}
