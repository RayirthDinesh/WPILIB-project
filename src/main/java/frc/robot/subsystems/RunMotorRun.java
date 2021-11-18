// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class RunMotorRun extends SubsystemBase {
  /** Creates a new RunMotorRun. */

  private static CANSparkMax motor = new CANSparkMax(Constants.RobotPort,MotorType.kBrushless);

  public RunMotorRun() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void goSpeed(double speed)
  {
    //motor.getPIDController().setReference(speed, ControlType.kDutyCycle);
    motor.set(speed);
  }
}