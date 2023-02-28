package edu.kata.oop.task02;

public class Robot {
    private int toX = 0;
    private int toY = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {    // текущее направление взгляда
        return direction;
    }

    public int geToX() {     // текущая координата Х
        return toX;
    }

    public int geToY() {     // текущая координата Y
        return toY;
    }

    public void turnLeft() { // повернуться на 90 градусов против часовой стрелки
        switch (direction){
            case UP -> direction = Direction.LEFT;
            case DOWN -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.DOWN;
            case RIGHT -> direction = Direction.UP;
        }
        System.out.println("Робот повернулся налево");
    }

    public void turnRight() { // повернуться на 90 градусов по часовой стрелке
        switch (direction){
            case UP -> direction = Direction.RIGHT;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
            case RIGHT -> direction = Direction.DOWN;
        }
        System.out.println("Робот повернулся направо");
    }

    public void stepForward() {
        switch (direction){
            case UP -> toY++;
            case DOWN -> toY--;
            case LEFT -> toX--;
            case RIGHT -> toX++;
        }
        System.out.println("Робот шагнул по направлению на 1");

        // шаг в направлении взгляда за один шаг робот изменяет
        // одну свою координату на единицу
    }
}
