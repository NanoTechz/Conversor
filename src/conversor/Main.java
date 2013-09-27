package conversor;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args){
		
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
	    System.out.println("Digite qual conversão deseja:");
	    System.out.println("1- Celsius para Fahrenheit");
	    System.out.println("2- Fahrenheit para Celsius");
	    System.out.println("3- Celsius para Kelvin");
	    System.out.println("4- Kelvin para Celsius");
	    System.out.println("5- Fahrenheit para Kelvin");
	    System.out.println("6- Kelvin para Fahrenheit");
	    
	    int opcao;
	    double valorTemperatura = -1;
	    double valorConvertido = -1;
	    
	    try {
			opcao = Integer.parseInt(leitor.readLine());
			
			System.out.println("Digite o valor que deseja converter:");
			valorTemperatura = Double.parseDouble(leitor.readLine());
			
			ConversorTemperatura conversor = new ConversorTemperatura();
			
			switch(opcao){
				case 1:
						valorConvertido = conversor.celsiusParaFahrenheit(valorTemperatura);
					break;
				case 2:
						valorConvertido = conversor.fahrenheitParaCelsius(valorTemperatura);
					break;
				case 3:
						valorConvertido = conversor.celsiusParaKelvin(valorTemperatura);
					break;
				case 4:
						valorConvertido = conversor.kelvinParaCelsius(valorTemperatura);
					break;
				case 5:
						valorConvertido = conversor.fahrenheitParaKelvin(valorTemperatura);
					break;
				case 6:
						valorConvertido = conversor.kelvinParaFahrenheit(valorTemperatura);
					break;
				default :
					System.out.println("Opcão inválida.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Erro na conversão da string em número.");
		} catch (IOException e) {
			System.out.println("Erro na leitura.");
		}finally {
			if (!(valorTemperatura == valorConvertido))
				System.out.println("O resultado da conversão é: " + valorConvertido);
		}
	}
}
