package us.nm.state.hsd;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {

	return celsius * 9 / 5 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
	return celsius + 273.15;
	
    }

    public static double kelvinToFahrenheit(double kelvin) {
	throw new UnsupportedOperationException("Not yet implemented"); // TODO Complete implementation
    }

    public static double kelvinToCelsius(double kelvin) {
	throw new UnsupportedOperationException("Not yet implemented"); // TODO Complete implementation
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - 32) * 5 / 9;
    
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	throw new UnsupportedOperationException("Not yet implemented"); // TODO Complete implementation
    }
}