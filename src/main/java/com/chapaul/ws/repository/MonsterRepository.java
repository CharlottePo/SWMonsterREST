/**
 * 
 */
package com.chapaul.ws.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chapaul.ws.entities.Monster;

// TODO: Auto-generated Javadoc
/**
 * The Class MonsterRepository.
 *
 * @author Paul
 */
@Repository
public class MonsterRepository {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(MonsterRepository.class);

	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Get list of monsters.
	 *
	 * @return Monsters
	 */
	public List<Monster> getMonsters() {
		log.info("Querying for monsters");
		List<Monster> monsters = jdbcTemplate.query("SELECT * FROM monsters;",
				new BeanPropertyRowMapper<Monster>(Monster.class));
		return monsters;
	}

	/**
	 * Gets the monster by id.
	 *
	 * @param id
	 *            the id
	 * @return the monster by id
	 */
	public Monster getMonsterById(int id) {
		log.info("Querying for monsters where id=" + id);
		String sql = "SELECT * FROM monsters WHERE id=?";
		Monster monster = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Monster>(Monster.class));
		return monster;
	}

	/**
	 * Gets the monster by name.
	 *
	 * @param name
	 *            the name
	 * @return the monster by name
	 */
	public Monster getMonsterByName(String name) {
		log.info("Querying for monsters where name=" + name);
		String sql = "SELECT * FROM monsters WHERE name LIKE ?";
		Monster monster = jdbcTemplate.queryForObject(sql, new Object[] { "%" + name + "%" },
				new BeanPropertyRowMapper<Monster>(Monster.class));
		return monster;
	}

}
