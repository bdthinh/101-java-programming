package com.company;

/**
 * Created by thinhdbui on 13/3/17.
 */
public class Point {
    int _x;
    int _y;

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public Point() {
        _x = 0;
        _y = 0;
    }

    public Point(int x, int y) {
        _x = x;
        _y = y;
    }

    public Point(Point anotherPoint) {
        _x = anotherPoint._x;
        _y = anotherPoint._y;
    }
}
