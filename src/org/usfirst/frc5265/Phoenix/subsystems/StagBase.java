// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.Phoenix.subsystems;

import org.usfirst.frc5265.Phoenix.Robot;
import org.usfirst.frc5265.Phoenix.RobotMap;
import org.usfirst.frc5265.Phoenix.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StagBase extends PIDSubsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon leftFront = RobotMap.stagBaseLeftFront;
    private final CANTalon leftRear = RobotMap.stagBaseLeftRear;
    private final CANTalon rightFront = RobotMap.stagBaseRightFront;
    private final CANTalon rightRear = RobotMap.stagBaseRightRear;
    private final RobotDrive stagMotor = RobotMap.stagBaseStagMotor;
    private final Encoder quadratureEncoder1 = RobotMap.stagBaseQuadratureEncoder1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
/*
 talon.changeControlMode(ControlMode.Position); //Change control mode of talon, default is PercentVbus (-1.0 to 1.0)
talon.setFeedbackDevice(FeedbackDevice.QuadEncoder); //Set the feedback device that is hooked up to the talon
talon.setPID(0.5, 0.001, 0.0); //Set the PID constants (p, i, d)
talon.enableControl(); //Enable PID control on the talon

*
*/
    // Initialize your subsystem here
    public StagBase() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("StagBase", 1, 0, 0);
        setAbsoluteTolerance(0.02);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("StagBase", "PIDSubsystem Controller", getPIDController());
        SmartDashboard.putString("print me", "init current encoder position " + rightFront.getEncPosition());
    	
        //leftRear.changeControlMode(TalonControlMode.Position);
        //leftRear.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        //leftRear.getEncPosition(encoderPos)
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    public void initDefaultCommand() {
        setDefaultCommand(new GoArcade());
    }

    public double returnEncoderValue () {
    	return rightFront.getEncPosition();
    }
    public void zeroEncoderValue () {
    	rightFront.setEncPosition(0);    	
    }
    public void setEncoderDistance(double distance){
    	rightFront.setPosition(distance);
    	
    }
    
    protected double returnPIDInput() {
 
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return quadratureEncoder1.pidGet();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
    }

    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        rightFront.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }
    
    public void GoArcade(Joystick steeringWheel){
    	Robot.stagBase.stagMotor.arcadeDrive(steeringWheel);    
    }
    
}
