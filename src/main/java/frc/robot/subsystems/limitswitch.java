// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class limitswitch extends SubsystemBase {
  public DigitalInput switchZero = new DigitalInput(0);
  /** Creates a new limitswitch. */
  public limitswitch() {
    //if(RobotContainer.motorswitch.switchZero.get()){
      //System.out.println(RobotContainer.gyroOne.robotGyro.getAngle());
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
