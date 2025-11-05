package artilerryCalculator.src;
public class Weather extends Shell{
    public static double calculateAirDensity(double pressure /*[Pa]*/, double molMass /*0,0289 kg/mol*/, double gasConstant /*R*/, double temperature /*Kelvin*/) {
        double airDensity;
        airDensity = (pressure*molMass)/(gasConstant*temperature);
        return airDensity;
    }

    public int freeApiCallLimit = 1000;
    public int ApiCallsMade = 0;

    public static double getWindSpeed(double altitude, Coordinates.coordinate location) {
        // Placeholder function to get windspeed from api based on altitude
        return 1.0; // Example: wind speed increases with altitude
    }
    public static double getWindDirection(double altitude, Coordinates.coordinate location) {
        // Placeholder function to get wind direction from api based on altitude
        return 90.0; // Example: wind direction changes with altitude
    }
    public static double getHumidity(double altitude, Coordinates.coordinate location) {
        // Placeholder function to get humidity from api based on altitude
        return 50.0; // Example: humidity decreases with altitude
    }
    public static double getTemperatureAtCoordinates(Coordinates.coordinate location) {
        // Placeholder function to get temperature from api based on coordinates
        return 15.0; // Example: base temperature at sea level
    }
    public static double getTemperatureAtGivenHeight(double altitude, double stockLocationAltitude, double temperatureAtCoordinates) {
        return temperatureAtCoordinates - (altitude - stockLocationAltitude / 1000) * 6.5;
    }
    public static double getAtmosphericPressureAtCoordinates(Coordinates.coordinate location) {
        // Placeholder function to get atmospheric pressure from api based on altitude
        return 1013.25;
    }
    public static double getAtmosphericPressureAtGivenHeight(double altitude, double stockLocationAltitude, double atmosphericPressureAtCoordinates) {
        // do uzupełnienia
    }


    public static void main(String[] args) {
        double temperature = 0.0; // °C
        double atmosphericPressure = 1000; //hPa
        double actualPressure = atmosphericPressure*100;
        double molMass = 0.0289; // kg/mol
        double gasConstant /*R*/= 8.31446261815324; // J/mol*K
        double T = temperature + 273.15; // K

        System.out.println("Air density:"+calculateAirDensity(actualPressure, molMass, gasConstant, T) + "kg/m3");
    }
}