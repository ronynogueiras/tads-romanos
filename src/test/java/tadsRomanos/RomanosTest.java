package tadsRomanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanosTest {

	@Test
    public void converteNumeroTest(){
    	Romanos numerosRomanos = new Romanos();
    	
    	assertEquals(0, numerosRomanos.romanoParaInteiro("MMMMM"));
    	assertEquals(4999, numerosRomanos.romanoParaInteiro("MMMMDCCCCLXXXXVIIII"));
    	assertEquals(1, numerosRomanos.romanoParaInteiro("I"));
    	assertEquals(0, numerosRomanos.romanoParaInteiro(""));
    }

}
