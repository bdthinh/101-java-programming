package com.company;

/**
 * Created by thinhdbui on 13/3/17.
 */
public class Circle extends Shape {
    final static double PI = 3.14;

    public Point get_center() {
        return _center;
    }

    public void set_center(Point _center) {
        this._center = _center;
    }

    public float get_radius() {
        return _radius;
    }

    public void set_radius(float _radius) {
        this._radius = _radius;
    }

    Point _center;
    float _radius;


    public Circle() {
        _center = new Point();
        _radius = 0;
    }

    public Circle(Point point, float radius) {
        _center = point;
        _radius = radius;
    }

    @Override
    public float tinhDienTich() {
        return (float)(_radius * _radius * PI);
    }

    @Override
    public float tinhChuVi() {
        return (float)(2 * _radius * PI);
    }

    @Override
    public void Xuat() {
        String str = String.format("Tâm: (%d, %d) - Bán kính: %f ", _center.getX(), _center.getY(), _radius);
        System.out.println(str);
    }
}
