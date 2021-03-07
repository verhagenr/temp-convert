package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TemperatureConverterTest {

    static final double FAHRENHEIT_TOLERANCE = 0.001;
    static final double KELVIN_TOLERANCE = 0.0005556;
    static final double CELSIUS_TOLERANCE = KELVIN_TOLERANCE;
    
    @DisplayName ("Test 1 celsiusToFahrenheit")
    @ParameterizedTest(name = "[{index}] Asserting celsiusToFahrenheit({0}) == {1}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToFahrenheit(double celsius, double fahrenheit) {
	assertEquals(fahrenheit,
		     TemperatureConverter.celsiusToFahrenheit(celsius),
		     FAHRENHEIT_TOLERANCE);
    }

    @DisplayName ("Test 2 celsiusToKelvin")
    @ParameterizedTest(name = "[{index}] Asserting celsiusToKelvin({0}) == {2}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(kelvin,
		     TemperatureConverter.celsiusToKelvin(celsius),
		     KELVIN_TOLERANCE);
    }

    @DisplayName ("Test 3 kelvinToFahrenheit")
    @ParameterizedTest(name = "[{index}] Asserting kelvinToFahrenheit({2}) == {1}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinToFahrenheit(double celsius, double fahrenheit, double kelvin) {
	assertEquals(fahrenheit,
		     TemperatureConverter.kelvinToFahrenheit(kelvin),
		     FAHRENHEIT_TOLERANCE);
    }

    @DisplayName ("Test 4 kelvinToCelsius")
    @ParameterizedTest(name = "[{index}] Asserting kelvinToCelsius({2}) == {0}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinToCelsius(double celsius, double fahrenheit, double kelvin) {
	assertEquals(celsius,
		     TemperatureConverter.kelvinToCelsius(kelvin),
		     CELSIUS_TOLERANCE);
    }

    @DisplayName ("Test 5 fahrenheitToCelsius")
    @ParameterizedTest(name = "[{index}] Asserting fahrenheitToCelsius({1}) == {0}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToCelsius(double celsius, double fahrenheit) {
	assertEquals(celsius,
		     TemperatureConverter.fahrenheitToCelsius(fahrenheit),
		     CELSIUS_TOLERANCE);
    }

    @DisplayName ("Test 6 fahrenheitToKelvin ")
    @ParameterizedTest(name = "[{index}] Asserting fahrenheitToKelvin({1}) == {2}.")
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(kelvin,
		     TemperatureConverter.fahrenheitToKelvin(fahrenheit),
		     KELVIN_TOLERANCE);
    }
}
