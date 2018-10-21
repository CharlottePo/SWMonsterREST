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
	private int basePv;
	private int baseAtq;
	private int baseDef;
	private int baseVit;
	private Double baseTxCrit;
	private Double baseDgtCrit;
	private Double baseRes;
	private Double basePrec;
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

	public Monster(String name, int natLevel, int basePv, int baseAtq, int baseDef, int baseVit, Double baseTxCrit,
			Double baseDgtCrit, Double baseRes, Double basePrec, int nbStars, int level, int maxLevel,
			List<Rune> runes) {
		super();
		this.name = name;
		this.natLevel = natLevel;
		this.basePv = basePv;
		this.baseAtq = baseAtq;
		this.baseDef = baseDef;
		this.baseVit = baseVit;
		this.baseTxCrit = baseTxCrit;
		this.baseDgtCrit = baseDgtCrit;
		this.baseRes = baseRes;
		this.basePrec = basePrec;
		this.nbStars = nbStars;
		this.level = level;
		this.maxLevel = maxLevel;
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
	 * @return the basePv
	 */
	public int getBasePv() {
		return basePv;
	}

	/**
	 * @param basePv
	 *            the basePv to set
	 */
	public void setBasePv(int basePv) {
		this.basePv = basePv;
	}

	/**
	 * @return the baseAtq
	 */
	public int getBaseAtq() {
		return baseAtq;
	}

	/**
	 * @param baseAtq
	 *            the baseAtq to set
	 */
	public void setBaseAtq(int baseAtq) {
		this.baseAtq = baseAtq;
	}

	/**
	 * @return the baseDef
	 */
	public int getBaseDef() {
		return baseDef;
	}

	/**
	 * @param baseDef
	 *            the baseDef to set
	 */
	public void setBaseDef(int baseDef) {
		this.baseDef = baseDef;
	}

	/**
	 * @return the baseVit
	 */
	public int getBaseVit() {
		return baseVit;
	}

	/**
	 * @param baseVit
	 *            the baseVit to set
	 */
	public void setBaseVit(int baseVit) {
		this.baseVit = baseVit;
	}

	/**
	 * @return the baseTxCrit
	 */
	public Double getBaseTxCrit() {
		return baseTxCrit;
	}

	/**
	 * @param baseTxCrit
	 *            the baseTxCrit to set
	 */
	public void setBaseTxCrit(Double baseTxCrit) {
		this.baseTxCrit = baseTxCrit;
	}

	/**
	 * @return the baseDgtCrit
	 */
	public Double getBaseDgtCrit() {
		return baseDgtCrit;
	}

	/**
	 * @param baseDgtCrit
	 *            the baseDgtCrit to set
	 */
	public void setBaseDgtCrit(Double baseDgtCrit) {
		this.baseDgtCrit = baseDgtCrit;
	}

	/**
	 * @return the baseRes
	 */
	public Double getBaseRes() {
		return baseRes;
	}

	/**
	 * @param baseRes
	 *            the baseRes to set
	 */
	public void setBaseRes(Double baseRes) {
		this.baseRes = baseRes;
	}

	/**
	 * @return the basePrec
	 */
	public Double getBasePrec() {
		return basePrec;
	}

	/**
	 * @param basePrec
	 *            the basePrec to set
	 */
	public void setBasePrec(Double basePrec) {
		this.basePrec = basePrec;
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

	/**
	 * @param maxLevel
	 *            the maxLevel to set
	 */
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

}
