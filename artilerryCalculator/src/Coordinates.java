package artilerryCalculator.src;

public class Coordinates extends MainCalculator {
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