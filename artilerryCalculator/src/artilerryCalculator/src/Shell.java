package artilerryCalculator.src;

import java.util.ArrayList;
import java.util.List;

public class Shell extends MainCalculator {
    public record shellType(double diameter/*mm*/, double verticalThrowSideArea, double lenght, double mass /*kg*/, double resistance, List<shape> shapes) {
        public double getDiameter() {
            return diameter;
        }
        public double getVerticalThrowSideArea() {
            return verticalThrowSideArea;
        }
        public double getLenght() {
            return lenght;
        }
        public double getMass() {
            return mass;
        }
        public double getResistance() {
            return resistance;
        }
        public List<shape> getShapes() {
            return shapes;
        }


    }
    public record shape(String name, double lenght, double diameter, double angle, double width, double circumference, double dragCoefficient) {
        public String getName() {
            return name;
        }
        public double getLenght() {
            return lenght;
        }
        public double getDiameter() {
            return diameter;
        }
        public double getAngle() {
            return angle;
        }
        public double getWidth() {
            return width;
        }
        public double getCircumference() {
            return circumference;
        }
        public double getDragCoefficient() { return dragCoefficient; }
        public shape getShape() {
            return this;
        }
    }
    public List<shape> shapes = new ArrayList<>();
    public static double calculateResistance(shellType shellType, List<shape> shapes, double airDensity, double velocity) {
        double finalDragcoefficient = 0;
        for (shape shape : shapes) {
            finalDragcoefficient += shape.getDragCoefficient() * (shape.getLenght() / shellType.getLenght());
        }
        return 0;
    }

    public static double calculateVerticalThrowSideArea(shellType shellType) {
        double verticalThrowSideArea;
        verticalThrowSideArea = 0;
        return verticalThrowSideArea;
    }

}