package com.dmc.dao;

import org.springframework.data.repository.CrudRepository;

import com.dmc.entity.User;

public interface UserDao extends CrudRepository<User, Integer> {

}