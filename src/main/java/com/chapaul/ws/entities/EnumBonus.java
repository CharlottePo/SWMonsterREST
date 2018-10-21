/**
 * 
 */
package com.chapaul.ws.entities;

/**
 * @author Paul
 *
 */
public enum EnumBonus {
	HP_FLAT("HP(+)"), HP("HP(%)"), ATQ_FLAT("ATQ(+)"), ATQ("ATQ(%)"), DEF_FLAT("DEF(+)"), DEF("DEF(%)"), VIT(
			"VIT(+)"), CRI_RATE("CRI_RATE(%)"), CRI_DMG("CRI_DMG(%)"), RES("RES(%)"), PREC("PREC(%)");

	private String literal;

	private EnumBonus(String literal) {
		this.literal = literal;
	}

}
