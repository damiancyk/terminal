package com.dmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmc.dao.UserDao;
import com.dmc.entity.User;
import com.dmc.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public Integer save(UserVo vo) {
		User entity = new User();
		entity.setEmail(vo.getEmail());
		entity.setFirstname(vo.getFirstname());
		entity.setLastname(vo.getLastname());
		entity.setAbout(vo.getAbout());
		entity.setWeight(vo.getWeight());
		entity.setRegisterDate(vo.getRegisterDate());
		userDao.save(entity);

		return entity.getId();
	}

	public void edit(UserVo vo) {
		User entity = userDao.findById(vo.getId()).get();
		entity.setEmail(vo.getEmail());
		entity.setFirstname(vo.getFirstname());
		entity.setLastname(vo.getLastname());
		entity.setAbout(vo.getAbout());
		entity.setWeight(vo.getWeight());
		entity.setRegisterDate(vo.getRegisterDate());

		userDao.save(entity);
	}

	public UserVo findById(Integer id) {
		User entity = userDao.findById(id).get();
		return new UserVo(entity);
	}

	public Iterable<User> findAll() {
		return userDao.findAll();
	}
}