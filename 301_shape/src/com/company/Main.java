package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Shape[] shapes = new Shape[n];
        for (int i = 0; i < n; i++) {
            System.out.print("0: Hình tròn - 1: Hình tam giác:: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Nhập tâm vòng tròn (x,y): ");
                    Point center = new Point(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Nhập bán kính: ");
                    float r = scanner.nextFloat();
                    shapes[i] = new Circle(center, r);
                    break;
                case 1:
                    System.out.println("Nhập A(x,y): ");
                    Point A = new Point(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Nhập B(x,y): ");
                    Point B = new Point(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Nhập C(x,y): ");
                    Point C = new Point(scanner.nextInt(), scanner.nextInt());
                    shapes[i] = new Triangle(A, B, C);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            shapes[i].Xuat();
        }

        float tongDienTich = 0;
        for (int i = 0; i < n; i++) {
            tongDienTich += shapes[i].tinhDienTich();
        }
        System.out.println(String.format("Diện tích các hình: %f", tongDienTich));

        int indexChuaHinhCoDienTichLonNhat = 0;
        float maxDienTich = 0;
        for (int i = 0; i < n; i++) {
            if (maxDienTich < shapes[i].tinhDienTich()) {
                maxDienTich = shapes[i].tinhDienTich();
                indexChuaHinhCoDienTichLonNhat = i;
            }
        }
        System.out.println("Hình có diện tích lớn nhất: ");
        shapes[indexChuaHinhCoDienTichLonNhat].Xuat();
    }

    // tách ra
}
