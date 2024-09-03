package be.vdab.goededoel;

import static org.assertj.core.api.Assertions.assertThat;

import be.vdab.goededoel.GoedeDoel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@BeforeEach
	void beforeEach() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}

	@Test
	void eenNieuwDoelHeeftGeenOpbrengst(){
		assertThat(doel.getOpbrengst()).isZero();
	}

	@Test
	void doelHeeftDezelfdeNaam(){
		assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
	}

	@Test
	void doelMetVerschillendeNaamIsVerschillend(){
		assertThat(doel).isNotEqualTo(new GoedeDoel(NAAM + "s"));
	}

	@Test
	void doelVerschiltVanAnderDataType(){
		assertThat(doel).isNotEqualTo(BigDecimal.ZERO);
	}

	/*@Test
	void fouteTest(){
		assertThat(0).isEqualTo(1);
	}*/



}
