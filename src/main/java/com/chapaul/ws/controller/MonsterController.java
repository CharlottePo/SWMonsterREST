/**
 * 
 */
package com.chapaul.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chapaul.ws.entities.Monster;
import com.chapaul.ws.repository.MonsterRepository;

/**
 * The Class MonsterController.
 *
 * @author Paul
 */
@CrossOrigin
@RestController
public class MonsterController {

	/** The monster repository. */
	@Autowired
	private MonsterRepository monsterRepository;

	/**
	 * Gets the monsters.
	 *
	 * @return the monsters
	 */
	@RequestMapping(path = "/monsters", method = RequestMethod.GET)
	public List<Monster> getMonsters() {
		return monsterRepository.getMonsters();
	}

	/**
	 * Gets the monster by id.
	 *
	 * @param id
	 *            the id
	 * @return the monster by id
	 */
	@RequestMapping(path = "/monsters/{id}", method = RequestMethod.GET)
	public Monster getMonsterById(@PathVariable("id") int id) {
		return monsterRepository.getMonsterById(id);
	}

	/**
	 * Gets the monster by name.
	 *
	 * @param name
	 *            the name
	 * @return the monster by name
	 */
	@RequestMapping(path = "/monsters/name/{name}", method = RequestMethod.GET)
	public Monster getMonsterByName(@PathVariable("name") String name) {
		return monsterRepository.getMonsterByName(name);
	}

}