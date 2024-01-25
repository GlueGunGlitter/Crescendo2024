// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in thhttps://maven.ctr-electronics.com/release/com/ctre/phoenix/Phoenix5-frc2024-latest.jsone root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.lib.util.COTSTalonFXSwerveConstants.SDS.MK3.driveRatios;
import frc.robot.Constants;

public class InTakeSubsystem extends SubsystemBase {
  WPI_VictorSPX intakeMotor = new WPI_VictorSPX(Constants.IntakeConstants.INTAKE_MOTOR_PORT);

  public void setIntakeMotorSpeed(double speed) {
    intakeMotor.set(speed);
  }

  /** Creates a new InTakeSubsystem. */
  public InTakeSubsystem() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
