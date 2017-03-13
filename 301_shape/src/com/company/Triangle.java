package com.company;

/**
 * Created by thinhdbui on 13/3/17.
 */
public class Triangle extends Shape{
    public Triangle() {
        _points = new Point[3];
    }

    public Triangle(Point A, Point B, Point C) {
        _points = new Point[3];
        _points[0] = new Point(A);
        _points[1] = new Point(B);
        _points[2] = new Point(C);
    }

    public float getAB() {
        return (float) Math.sqrt(
            (_points[0].getX() - _points[1].getX()) *
            (_points[0].getY() - _points[1].getY())
        );
    }

    public float getBC() {
        return (float) Math.sqrt(
            (_points[1].getX() - _points[2].getX()) *
            (_points[1].getY() - _points[2].getY())
        );
    }

    public float getCA() {
        return (float) Math.sqrt(
            (_points[2].getX() - _points[0].getX()) *
            (_points[2].getY() - _points[0].getY())
        );
    }

    @Override
    public float tinhDienTich() {
        float dientich = 0;
        float p = tinhChuVi() / 2;
        float a = getAB();
        float b = getBC();
        float c = getCA();
        dientich = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dientich;
    }

    @Override
    public float tinhChuVi() {
        return getAB() + getBC() + getCA();
    }

    @Override
    public void Xuat() {
        String pointA = String.format("A(%d, %d)", _points[0].getX(), _points[0].getY());
        String pointB = String.format("B(%d, %d)", _points[1].getX(), _points[1].getY());
        String pointC = String.format("C(%d, %d)", _points[2].getX(), _points[2].getY());

        System.out.println(pointA + ", " + pointB + ", " + pointC);
    }
}
