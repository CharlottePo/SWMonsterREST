/**
 * 
 */
package com.chapaul.ws.entities;

import java.util.List;

/**
 * @author Paul
 *
 */
public class Monster {

	private int id;
	// Default stats
	private String name;
	private int natLevel;
	// Stats
	private int basePV;
	private int baseATQ;
	private int baseDEF;
	private int baseVIT;
	private Double baseCritTx;
	private Double baseCritDgt;
	private Double baseRES;
	private Double basePREC;
	// End Default stats
	private int nbStars;
	private int level;
	private int maxLevel;

	private List<Rune> runes;

	private int getMaxLevel() throws Exception {
		if (this.nbStars == EnumStars.ONE_STARS.getValue()) {
			this.maxLevel = 15;
		} else if (this.nbStars == EnumStars.TWO_STARS.getValue()) {
			this.maxLevel = 20;
		} else if (this.nbStars == EnumStars.THREE_STARS.getValue()) {
			this.maxLevel = 25;
		} else if (this.nbStars == EnumStars.FOUR_STARS.getValue()) {
			this.maxLevel = 30;
		} else if (this.nbStars == EnumStars.FIVE_STARS.getValue()) {
			this.maxLevel = 35;
		} else if (this.nbStars == EnumStars.SIX_STARS.getValue()) {
			this.maxLevel = 40;
		} else {
			throw new Exception("Erreur en récupérant le niveau max du monstres.");
		}

		return this.maxLevel;
	}

	// private List<Competence> competences;
	public Monster() {
		super();
	}

	public Monster(String name, int natLevel, int basePV, int baseATQ, int baseDEF, int baseVIT, Double baseCritTx,
			Double baseCritDgt, Double baseRES, Double basePREC, int nbStars, int level, List<Rune> runes) {
		super();
		this.name = name;
		this.natLevel = natLevel;
		this.basePV = basePV;
		this.baseATQ = baseATQ;
		this.baseDEF = baseDEF;
		this.baseVIT = baseVIT;
		this.baseCritTx = baseCritTx;
		this.baseCritDgt = baseCritDgt;
		this.baseRES = baseRES;
		this.basePREC = basePREC;
		this.nbStars = nbStars;
		this.level = level;
		this.runes = runes;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the natLevel
	 */
	public int getNatLevel() {
		return natLevel;
	}

	/**
	 * @param natLevel
	 *            the natLevel to set
	 */
	public void setNatLevel(int natLevel) {
		this.natLevel = natLevel;
	}

	/**
	 * @return the basePV
	 */
	public int getBasePV() {
		return basePV;
	}

	/**
	 * @param basePV
	 *            the basePV to set
	 */
	public void setBasePV(int basePV) {
		this.basePV = basePV;
	}

	/**
	 * @return the baseATQ
	 */
	public int getBaseATQ() {
		return baseATQ;
	}

	/**
	 * @param baseATQ
	 *            the baseATQ to set
	 */
	public void setBaseATQ(int baseATQ) {
		this.baseATQ = baseATQ;
	}

	/**
	 * @return the baseDEF
	 */
	public int getBaseDEF() {
		return baseDEF;
	}

	/**
	 * @param baseDEF
	 *            the baseDEF to set
	 */
	public void setBaseDEF(int baseDEF) {
		this.baseDEF = baseDEF;
	}

	/**
	 * @return the baseVIT
	 */
	public int getBaseVIT() {
		return baseVIT;
	}

	/**
	 * @param baseVIT
	 *            the baseVIT to set
	 */
	public void setBaseVIT(int baseVIT) {
		this.baseVIT = baseVIT;
	}

	/**
	 * @return the baseCritTx
	 */
	public Double getBaseCritTx() {
		return baseCritTx;
	}

	/**
	 * @param baseCritTx
	 *            the baseCritTx to set
	 */
	public void setBaseCritTx(Double baseCritTx) {
		this.baseCritTx = baseCritTx;
	}

	/**
	 * @return the baseCritDgt
	 */
	public Double getBaseCritDgt() {
		return baseCritDgt;
	}

	/**
	 * @param baseCritDgt
	 *            the baseCritDgt to set
	 */
	public void setBaseCritDgt(Double baseCritDgt) {
		this.baseCritDgt = baseCritDgt;
	}

	/**
	 * @return the baseRES
	 */
	public Double getBaseRES() {
		return baseRES;
	}

	/**
	 * @param baseRES
	 *            the baseRES to set
	 */
	public void setBaseRES(Double baseRES) {
		this.baseRES = baseRES;
	}

	/**
	 * @return the basePREC
	 */
	public Double getBasePREC() {
		return basePREC;
	}

	/**
	 * @param basePREC
	 *            the basePREC to set
	 */
	public void setBasePREC(Double basePREC) {
		this.basePREC = basePREC;
	}

	/**
	 * @return the nbStars
	 */
	public int getNbStars() {
		return nbStars;
	}

	/**
	 * @param nbStars
	 *            the nbStars to set
	 */
	public void setNbStars(int nbStars) {
		this.nbStars = nbStars;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the runes
	 */
	public List<Rune> getRunes() {
		return runes;
	}

	/**
	 * @param runes
	 *            the runes to set
	 */
	public void setRunes(List<Rune> runes) {
		this.runes = runes;
	}

}
