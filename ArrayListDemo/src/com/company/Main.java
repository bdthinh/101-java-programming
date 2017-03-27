package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<PhanSo> phanSoArr = new ArrayList<PhanSo>();
        // ArrayList <E> list = new ArrayList <E>();
        // Object, Integer, String, Float, Double
        // NEVER integer, float, string, double, boolean // primitive data type
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            PhanSo ps = new PhanSo(scanner.nextInt(), scanner.nextInt());
            phanSoArr.add(ps);
        }
        for (int i = 0; i < phanSoArr.size(); i++) {
            String phanSoInString = String.format("%d/%d", phanSoArr.get(i).get_tu(), phanSoArr.get(i).get_mau());
            System.out.println(phanSoInString);

        }
        int k = scanner.nextInt();
        phanSoArr.remove(k);

        phanSoArr.get(k).set_tu(scanner.nextInt());
        phanSoArr.get(k).set_mau(scanner.nextInt());

        double max = 0;
        int position = 0;
        for (int i = 0; i < phanSoArr.size(); i++) {
            if (max < (double)phanSoArr.get(i).get_tu() / phanSoArr.get(i).get_mau()) {
                max = phanSoArr.get(i).get_tu() / phanSoArr.get(i).get_mau();
                position = i;
            }
        }
        System.out.println(position);

        phanSoArr.clear();
    }

    /**
     *
     * @param psar
     * @param ps
     * @throws Exception
     */
    public static void addPhanSo(ArrayList<PhanSo> psar, PhanSo ps) throws Exception {
        try {
            psar.add(ps);
        } catch(Exception ex) {
            throw ex;
        }
    }
}

//ArrayList isA List
//List: front - rear
//add to rear/ tail

