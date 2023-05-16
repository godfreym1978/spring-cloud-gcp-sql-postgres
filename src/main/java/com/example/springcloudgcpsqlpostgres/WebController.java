package com.example.springcloudgcpsqlpostgres;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web app controller for sample app.
 *
 * @author João André Martins
 */
@RestController
public class WebController {

	private final JdbcTemplate jdbcTemplate;

	public WebController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/getTuples")
	public List<String> getTuples() {
		return this.jdbcTemplate.queryForList("SELECT * FROM users").stream()
				.map((m) -> m.values().toString())
				.collect(Collectors.toList());
	}
}