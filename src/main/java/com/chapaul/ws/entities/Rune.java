/**
 * 
 */
package com.chapaul.ws.entities;

/**
 * @author Paul
 *
 */
public class Rune {

	private int id;
	private EnumBonus bonus;
	private int nbStars;
	private int level;

	public double getBonusValue() throws Exception {
		throw new Exception("Not implemented yet");
	}

	public Rune(EnumBonus bonus, int nbStars, int level) {
		super();
		this.bonus = bonus;
		this.nbStars = nbStars;
		this.level = level;
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
	 * @return the bonus
	 */
	public EnumBonus getBonus() {
		return bonus;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(EnumBonus bonus) {
		this.bonus = bonus;
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

}
