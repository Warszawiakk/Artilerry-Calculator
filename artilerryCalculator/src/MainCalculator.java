package artilerryCalculator.src;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class MainCalculator {
    public static void calculateDistanceTest() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("P1 Enter latitude:");
        double lat1 = scanner.nextDouble();
        System.out.println("P1 Enter longitude:");
        double lon1 = scanner.nextDouble();
        System.out.println("P2 Enter latitude:");
        double lat2 = scanner.nextDouble();
        System.out.println("P2 Enter longitude:");
        double lon2 = scanner.nextDouble();
        Coordinates.coordinate P1 = new Coordinates.coordinate(lat1, lon1, 0);
        Coordinates.coordinate P2 = new Coordinates.coordinate(lat2, lon2, 0);
        double distance = Coordinates.calculateDistance(P1, P2);
        double distanceInKm = distance / 1000;
        System.out.println("Distance between P1 and P2: " + distance + " m, or " + distanceInKm + " km");
    }
    public static void main(String[] args) {
        System.out.println("=====Display_Test=====");
        calculateDistanceTest();
    }

}