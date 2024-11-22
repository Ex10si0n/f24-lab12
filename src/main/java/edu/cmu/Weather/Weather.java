package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * 
     * @return the rainfall amount. If the measurement is in inches, it returns the value as is.
     *         If the measurement is not in inches, it converts the value to millimeters.
     */
    public double getRainfall(boolean useImperial) {
        double wsRainfall = weatherService.getRainfall();
        if (useImperial) {
            return wsRainfall / 25.4;
        } else {
            return wsRainfall;
        }
    }
}
