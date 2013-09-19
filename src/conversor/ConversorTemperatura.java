package conversor;

/**
 *
 * @author Nanson Augusto
 */

public class ConversorTemperatura {

    public int celsiusParaFahrenheit() {
        return (9 * 40) / 5 + 32;
    }

    public int celsiusParaFahrenheit(int celsius) {
        return (9 * celsius) / 5 + 32;
    }

    public double celsiusParaFahrenheit(double celsius) {
        return (9.0 * celsius) / 5.0 + 32.0;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
    	return (fahrenheit - 32) * (5.0/9.0);
    }

    public double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }

    public double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }
}
