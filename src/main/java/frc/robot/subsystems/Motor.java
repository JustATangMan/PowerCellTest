/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.DriveMotor;

public class Motor extends Subsystem {
  /**
   * Creates a new Motor.
   */
  SpeedController someMotor = new VictorSP(0);
  SpeedController anotherMotor = new VictorSP(1);

  public Motor() {
  }

  @Override
  protected void initDefaultCommand() {
    setDefaultCommand(new DriveMotor());
    // TODO Auto-generated method stub

  }

  public void drive(double speed) {
    someMotor.set(speed);
    anotherMotor.set(-speed);
  }

  public void stop() {
    someMotor.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
