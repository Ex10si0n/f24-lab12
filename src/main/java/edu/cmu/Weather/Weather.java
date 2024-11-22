package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private Scale scale;

    /**
     * Sets the length scale for rainfall.
     *
     * @param scale the preferred scale for rainfall measurements
     */
    public void setLengthScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     *
     * @return the rainfall amount. If the measurement is in inches, it returns the value as is.
     * If the measurement is not in inches, it converts the value to millimeters.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (this.scale == Scale.MILLIMETERS) {
            return wsRainfall / 25.4;
        } else if (this.scale == Scale.INCHES) {
            return wsRainfall;
        }
        return wsRainfall;
    }
}
