package com.maven.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	private final JdbcTemplate jdbcTemplate;
	
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addStudent(int id, String name) {
		String sql = "INSERT INTO student (id, name) VALUES (?, ?)";
		return jdbcTemplate.update(sql, id, name);
	}
}
