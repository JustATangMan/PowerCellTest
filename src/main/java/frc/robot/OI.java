package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ButtonMotorDrive;

public class OI {
    private final Joystick logi = new Joystick(0);
    private final Button btnWheel;

    public OI() {
        btnWheel = new JoystickButton(logi, 2);
        btnWheel.whileHeld(new ButtonMotorDrive());

    }

    public Joystick getJoy() {
        return logi;
    }

    public boolean wheelCheck() {
        return btnWheel.get();
    }
}