/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

/**
 *
 * @author RoboHawks
 */
public class drive {
    Team3373 testing = new Team3373();
    Joystick drivestick = new Joystick(1);
    RobotDrive drive = new RobotDrive(1,2);
    boolean driveA = drivestick.getRawButton(1);
    double driveLX =  drivestick.getRawAxis(1);
    double driveLY =  drivestick.getRawAxis(2);
    
    public void Driving(double a){
    if (driveLY >= 0 && driveLY <= 1){
        
    }
    if (driveLY <= 0 && driveLY >= -1 ){
        
    }
 }
}
