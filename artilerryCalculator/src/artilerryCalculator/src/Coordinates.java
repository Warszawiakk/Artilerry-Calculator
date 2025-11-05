package artilerryCalculator.src;

public class Coordinates extends Weather {
    public static record coordinate(double latitude, double longitude, double height) {
        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public double getHeight() {
            return height;
        }
    }
    public static coordinate getDeviceCoordinates() {
        // Placeholder function to get device coordinates
        return new coordinate(0.0, 0.0, 0.0); // Example coordinates
    }
    public static coordinate getTargetCoordinates(boolean mode) {
        double latitude;
        double longitude;
        double height;
        if (mode) {
            // manual mode
            latitude = 0.0 /* placeholder for user input */;
            longitude = 0.0 ;
            height = 0.0;
            return new coordinate(latitude, longitude, height); // Example coordinates
        } else {
            // select from map
            return null;
        }
    }

    public static double calculateDistance(coordinate A, coordinate B) {
        final double R = 6371000;

        double lat1 = Math.toRadians(A.latitude);
        double lon1 = Math.toRadians(A.longitude);
        double lat2 = Math.toRadians(B.latitude);
        double lon2 = Math.toRadians(B.longitude);

        double deltaLon = lon2 - lon1;
        double centralAngle = Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(deltaLon)
        );
        double distance;
        distance = R * centralAngle;

        return distance;
    }
}