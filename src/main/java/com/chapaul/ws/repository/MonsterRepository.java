/**
 * 
 */
package com.chapaul.ws.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chapaul.ws.entities.Monster;

/**
 * @author Paul
 *
 */
@Repository
public class MonsterRepository {
	private static final Logger log = LoggerFactory.getLogger(MonsterRepository.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void init() {
		log.info("Creating tables");

		jdbcTemplate.execute("DROP TABLE IF EXISTS monsters;");
		jdbcTemplate.execute("CREATE TABLE monsters ("
				+ "id SERIAL, name VARCHAR(255), nat_level INTEGER, nb_stars INTEGER, level INTEGER, pv INTEGER,"
				+ "atq INTEGER, def INTEGER, vit INTEGER, tx_crit FLOAT, dgt_crit FLOAT, res FLOAT, prec FLOAT);");
		insertDummyData();
	}

	public void insertDummyData() {
		log.info("Insert dummy data");

		List<Monster> monstersToAdd = new ArrayList<>();

		// Monster m1 = new Monster("Veromos", 5, 5, 35, 6780, 565, 557, 100, 0.19,
		// 0.64, 0.52, 0.49);
		// Monster m2 = new Monster("Belladeon", 3, 5, 35, 7260, 347, 500, 108, 0.21,
		// 0.60, 0.30, 0.20);
		// Monster m3 = new Monster("Chasun", 4, 5, 16, 6030, 360, 318, 101, 0.35, 0.66,
		// 0.74, 0.20);
		// monstersToAdd.add(m1);
		// monstersToAdd.add(m2);
		// monstersToAdd.add(m3);
		//
		// for (int i = 0; i < monstersToAdd.size(); i++) {
		// jdbcTemplate.execute("INSERT INTO monsters (name, nat_level, nb_stars, level,
		// pv, "
		// + "atq, def, vit, tx_crit, dgt_crit, res, prec) VALUES ('" +
		// monstersToAdd.get(i).getName() + "',"
		// + monstersToAdd.get(i).getNatLevel() + "," +
		// monstersToAdd.get(i).getNbStars() + ","
		// + monstersToAdd.get(i).getLevel() + "," + monstersToAdd.get(i).getPV() + ","
		// + monstersToAdd.get(i).getATQ() + "," + monstersToAdd.get(i).getDEF() + ","
		// + monstersToAdd.get(i).getVIT() + "," + monstersToAdd.get(i).getTxCrit() +
		// ","
		// + monstersToAdd.get(i).getDgtCrit() + "," + monstersToAdd.get(i).getRES() +
		// ","
		// + monstersToAdd.get(i).getPREC() + ");");
		// }
	}

	/**
	 * @return
	 */
	public List<Monster> getMonsters() {
		log.info("Querying for monsters");
		List<Monster> monsters = jdbcTemplate.query("SELECT * FROM monsters;",
				new BeanPropertyRowMapper(Monster.class));
		return monsters;
	}

}
