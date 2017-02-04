// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.Phoenix;

import org.usfirst.frc5265.Phoenix.commands.*;
import org.usfirst.frc5265.Phoenix.subsystems.StagValues;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton btnShoot;
    public JoystickButton btnClamp;
    public JoystickButton btnCamera;
    public JoystickButton btnLow;
    public JoystickButton btnBall;
    public JoystickButton btnStart;
    public JoystickButton btnBrush;
    public JoystickButton btnPortcul;
    public JoystickButton btnChevDefree;
    public JoystickButton btnRampart;
    public JoystickButton btnReverseBrush;
    public Joystick steeringWheel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        steeringWheel = new Joystick(0);
        
        btnShoot = new JoystickButton(steeringWheel, 1);
        btnShoot.whenPressed(new Shoot());

        btnBrush = new JoystickButton(steeringWheel, 2);
        btnBrush.whenPressed(new Brush());
        
        btnReverseBrush = new JoystickButton(steeringWheel, 3);
        btnReverseBrush.whenPressed(new reverseBrush());
        
        btnCamera = new JoystickButton(steeringWheel, 5);
        btnCamera.whileHeld(new ToggleCamera());
        
        btnStart = new JoystickButton(steeringWheel, 7);
        btnStart.whenPressed(new posStart());
        btnBall = new JoystickButton(steeringWheel, 8);
        btnBall.whenPressed(new posBall());
        btnLow = new JoystickButton(steeringWheel, 9);
        btnLow.whenPressed(new posLow());
        
        btnClamp = new JoystickButton(steeringWheel, 10);
        btnClamp.whenPressed(new Clamp());
        
        btnRampart = new JoystickButton(steeringWheel, 11);
        btnRampart.whenPressed(new Rampart());
        
        
          
        /* commented out by Dr. N.
        btnRampart = new JoystickButton(steeringWheel, 1);
        btnRampart.whileHeld(new Rampart());
        btnChevDefree = new JoystickButton(steeringWheel, 1);
        btnChevDefree.whenPressed(new ChevDefree());
        btnPortcul = new JoystickButton(steeringWheel, 1);
        btnPortcul.whenPressed(new Portcul());
        btnChange = new JoystickButton(steeringWheel, 1);
        btnChange.whenPressed(new posChange());
        btnBall = new JoystickButton(steeringWheel, 1);
        btnBall.whenPressed(new posBall());
        btnLow = new JoystickButton(steeringWheel, 1);
        btnLow.whenPressed(new posLow());
        */
        

        // SmartDashboard Buttons
        /* commented out by Dr. N.
        SmartDashboard.putData("autoWall", new autoWall());
        SmartDashboard.putData("autoMoat", new autoMoat());
        SmartDashboard.putData("autoLowBar", new autoLowBar());
        SmartDashboard.putData("autoRampart", new autoRampart());
        SmartDashboard.putData("autoRoughTerrain", new autoRoughTerrain());
        SmartDashboard.putData("autoPortcul", new autoPortcul());
        SmartDashboard.putData("autoChevDefree", new autoChevDefree());
        SmartDashboard.putData("driveByTime", new driveByTime(StagValues.initAutoSpeed,StagValues.initAutoSpeed, StagValues.initDefenseTime));
        SmartDashboard.putData("driveByDistance", new driveByDistance(StagValues.initAutoSpeed,StagValues.initAutoSpeed, StagValues.initDist2Defense));
        SmartDashboard.putData("posLow", new posLow());
        SmartDashboard.putData("posBall", new posBall());
        SmartDashboard.putData("posStart", new posStart());
        SmartDashboard.putData("posChange", new posChange());
        SmartDashboard.putData("Brush", new Brush());
        SmartDashboard.putData("Portcul", new Portcul());
        SmartDashboard.putData("Rampart", new Rampart());
        SmartDashboard.putData("ChevDefree", new ChevDefree());
        SmartDashboard.putData("Clamp", new Clamp());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("ToggleCamera", new ToggleCamera());
        */

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getSteeringWheel() {
        return steeringWheel;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

