/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveMotor extends Command {
  /**
   * Creates a new DriveMotor.
   */
  public DriveMotor() {
    // Use addRequirements() here to declare subsystem dependencies.
    requires(Robot.m_mot);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.m_mot.drive(Robot.m_oi.getJoy().getY() * Robot.m_oi.getJoy().getThrottle());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end() {
    System.out.println("end");
    Robot.m_mot.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
