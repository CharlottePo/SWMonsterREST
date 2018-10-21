/**
 * 
 */
package com.chapaul.ws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chapaul.ws.entities.Monster;
import com.chapaul.ws.repository.MonsterRepository;

/**
 * @author Paul
 *
 */
@RestController
public class MonsterController {

	@Autowired
	private MonsterRepository monsterRepository;

	@RequestMapping("/monsters")
	public List<Monster> getMonsters() {
		List<Monster> monsters = new ArrayList<>();
		return monsterRepository.getMonsters();
	}

}
