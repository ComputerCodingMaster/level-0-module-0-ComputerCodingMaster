/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
Robot Hans= new Robot();
Hans.penDown();
Hans.setSpeed(1000);
Hans.move(200);
Hans.turn(90);
Hans.move(200);
Hans.turn(90);
Hans.move(200);
Hans.turn(90);
Hans.move(200);

    }
}
