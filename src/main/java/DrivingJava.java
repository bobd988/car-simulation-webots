import com.cyberbotics.webots.controller.*;
import com.cyberbotics.webots.controller.vehicle.Car;

public class DrivingJava extends Car {
    private int timeStep = 128;
    private Camera camera = getCamera("camera");
    void run() {
        while (step(timeStep) != -1) {
            setCruisingSpeed(30.0);
            setSteeringAngle(-0.1);
        }
    }
    public static void main(String[] args) {
        new DrivingJava().run();

    }
}
