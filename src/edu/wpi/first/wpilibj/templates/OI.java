package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    Joystick leftJoystick = new Joystick(RobotMap.leftJoystickPort);
    Joystick rightJoystick = new Joystick(RobotMap.rightJoystickPort);

    Jaguar leftMotor = new Jaguar(RobotMap.leftMotorPort);
    Jaguar rightMotor = new Jaguar(RobotMap.rightMotorPort);

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return leftJoystick;
    }

    public Jaguar getLeftMotor() {
        return leftMotor;
    }

    public Jaguar getRightMotor() {
        return rightMotor;
    }
}
