/**
 * 
 */
package com.chapaul.ws.entities;

/**
 * @author Paul
 *
 */
public enum EnumStars {
	ONE_STARS(1), TWO_STARS(2), THREE_STARS(3), FOUR_STARS(4), FIVE_STARS(5), SIX_STARS(6);

	private int value;

	private EnumStars(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}
