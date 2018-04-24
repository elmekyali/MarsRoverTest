package com.sqli.challenge;

import com.sqli.challenge.Direction;

class Position {
    static int horizontalPosition = 0;
    static int verticalPosition = 0;
    static Direction direction = Direction.RIGHT;

    static void changeDirection(Direction direction) {
        switch (direction) {
            case FORWARD : {
                move(Direction.FORWARD);
            } break;
            case RIGHT : {
                move(Direction.RIGHT);
            }
        }
    }

    private static void move(Direction direction) {
        if (Position.direction == Direction.RIGHT) {
            horizontalPosition++;
            Position.direction = Direction.DOWN;
        } else {
            if (Position.direction == Direction.LEFT) {
                horizontalPosition--;
                Position.direction = Direction.TOP;
            } else {
                if (Position.direction == Direction.TOP) {
                    verticalPosition--;
                    Position.direction = Direction.RIGHT;
                } else {
                    if (Position.direction == Direction.DOWN) {
                        verticalPosition++;
                        Position.direction = Direction.LEFT;
                    }
                }
            }
        }
    }

    private static Direction changeDirection ( Direction previousDirection , Direction newDirection ) {

    }
}
