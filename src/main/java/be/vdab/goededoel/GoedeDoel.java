package be.vdab.goededoel;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author Joe Dalton
 */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	/**
	 * Maakt een GoedeDoel object
	 * @param naam De naam van het goede doel
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/**
	 * Geeft de naam terug
	 * @return de naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * Geeft de opbrengst terug
	 * @return de opbrengst
	 */
	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GoedeDoel goedeDoel)) return false;
        return Objects.equals(naam, goedeDoel.naam);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(naam);
	}
}
