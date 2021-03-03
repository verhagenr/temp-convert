package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TemperatureConverterTest {

    static final double FAHRENHEIT_TOLERANCE = 0.001;
    static double KELVIN_TOLERANCE = 0.0005556;
    
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celciusToFahrenheit(double celcius, double fahrenheit) {
	assertEquals(fahrenheit,
		     TemperatureConverter.celsiusToFahrenheit(celcius),
		     FAHRENHEIT_TOLERANCE
	);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celciusToKelvin(double celcius, double fahrenheit, double kelvin) {
	assertEquals(
		     kelvin,
		     TemperatureConverter.celsiusToKelvin(celcius),
		     KELVIN_TOLERANCE
	);
    }

}
