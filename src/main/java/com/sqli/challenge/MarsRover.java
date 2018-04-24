package com.sqli.challenge;

import java.util.*;

public class MarsRover {

    public static final String LINE_SEPARATOR = "\n";
    private List<Coordinate> coordinates;

    public MarsRover(String direction) {
        coordinates = new LinkedList<>();
        for (char movement : direction.toCharArray()) {
            if (movement == 's') moveForward();
            if (movement == 'l') turnLeft();
            if (movement == 'r') turnRight();
        }
    }

    public String path() {
        return "";
    }

    public MarsRover turnLeft() {
        Position.changeDirection(Direction.LEFT);
        return this;
    }

    public MarsRover moveForward() {
        Position.changeDirection(Direction.FORWARD);
        return this;
    }

    public MarsRover turnRight() {
        Position.changeDirection(Direction.RIGHT);
        return this;
    }
}
