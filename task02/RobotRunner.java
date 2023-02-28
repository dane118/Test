package edu.kata.oop.task02;

public class RobotRunner {
    public static void main(String[] args) {
        // (0, 0) начальное положение
        // (UP) ориентация
        Robot robot = new Robot();
        int toX = -2;
        int toY = 3;
        moveRobot(robot, toX,toY);
    }
    public static void moveRobot(Robot robot, int toX, int toY){
        // движение по X
        // true - Left, false - Right

        // движение по оси Х
        if (robot.geToX() > toX){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
            }
            while (robot.geToX() != toX){
                robot.stepForward();
            }
        }
        else {
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnRight();
            }
            while (robot.geToX() != toX){
                robot.stepForward();
            }
        }
        // движение по оси Y
        if (robot.geToY() > toY){
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
            while (robot.geToY() != toY){
                robot.stepForward();
            }
        }
        else {
            while (robot.getDirection() != Direction.UP){
                robot.turnRight();
            }
            while (robot.geToY() != toY){
                robot.stepForward();
            }
        }
        System.out.println("Робот пришел в точку с координатами:");
        System.out.println("X : " + robot.geToX() + " Y : " + robot.geToY());
    }
}
