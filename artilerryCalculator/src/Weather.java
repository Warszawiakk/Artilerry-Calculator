package artilerryCalculator.src;
public class Weather extends Shell{
    public static double calculateAirDensity(double pressure /*[Pa]*/, double molMass /*0,0289 kg/mol*/, double gasConstant /*R*/, double temperature /*Kelvin*/) {
        double airDensity;
        airDensity = (pressure*molMass)/(gasConstant*temperature);
        return airDensity;
    }

    public static void main(String[] args) {
        double temperature = 20.0; // °C
        double atmosphericPressure = 1000; //hPa
        double actualPressure = atmosphericPressure*100;
        double molMass = 0.0289; // kg/mol
        double gasConstant /*R*/= 8.31446261815324; // J/mol*K
        double T = temperature + 273.15; // K

        System.out.println("Air density:"+calculateAirDensity(actualPressure, molMass, gasConstant, T) + "kg/m3");
    }
}