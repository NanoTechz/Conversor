package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.ConversorTemperatura;

public class ConversorTemperaturaTest {
	
	private ConversorTemperatura conversor;
	private double MARGEM_ERRO = 1e-6;
	
	@Before
	public void setUp() throws Exception {
		conversor = new ConversorTemperatura();
	}

	@Test
	public void celsiusParaFahrenheitTest() {
		assertEquals(104, conversor.celsiusParaFahrenheit());
	}
	
	@Test
	public void celsiusParaFahrenheitComParametroTest() {
		//teste passando um inteiro
		assertEquals(104, conversor.celsiusParaFahrenheit(40));
		//teste passando um double
		assertEquals(104.0, conversor.celsiusParaFahrenheit(40.0), MARGEM_ERRO);
	}
	
	@Test
	public void fahrenheitParaCelsiusTest(){
		assertEquals(44.6388889, conversor.fahrenheitParaCelsius(112.35), MARGEM_ERRO);
	}
	
	@Test
	public void kelvinParaCelsiusTest(){
		assertEquals(-160.8, conversor.kelvinParaCelsius(112.35), MARGEM_ERRO);
	}
	
	@Test 
	public void celsiusParaKelvinTest(){
		assertEquals(112.35, conversor.celsiusParaKelvin(-160.8), MARGEM_ERRO);
	}
	
	@Test
	public void kelvinParaFahrenheitTest(){
		assertEquals(106.34, conversor.kelvinParaFahrenheit(314.45), MARGEM_ERRO);
	}
	
	@Test
	public void fahrenheitParaKelvin(){
		assertEquals(314.45, conversor.fahrenheitParaKelvin(106.34), MARGEM_ERRO);
	}

}
