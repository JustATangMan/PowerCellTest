package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    private final Joystick logi = new Joystick(0);

    public OI() {

    }

    public Joystick getJoy() {
        return logi;
    }
}