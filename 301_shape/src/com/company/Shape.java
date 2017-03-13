package com.company;

/**
 * Created by thinhdbui on 13/3/17.
 */
public abstract class Shape {
    protected Point[] _points;

    public Point[] getPoints() {
        return _points;
    }

    public void setPoints(Point[] otherPoints) {
        _points = otherPoints;
    }

    abstract public float tinhDienTich();
    abstract public float tinhChuVi();
    abstract public void Xuat();
}
