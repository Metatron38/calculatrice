package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calcul.calculatrice;

class calculatriceTest {

	@Test
	public void testCalculAddition() {
		
		calculatrice calculette = new calculatrice();

		  // Set up
		calculette.ecran.setText("2");
		calculette.operateur = "+";
		calculette.chiffre1 = 3.0;
		
		  // Execute
		calculette.calcul();
		
		  // Verify
		  assertEquals("5.0", calculette.ecran.getText());
	}
}
