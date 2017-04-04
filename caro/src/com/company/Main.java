package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VanCo vanco = new VanCo(8, 8);
        NguoiChoi playerA = new NguoiChoi('x');
        NguoiChoi playerB = new NguoiChoi('o');
        Scanner scanner = new Scanner(System.in);
        while(!vanco.is_ketThuc()) {
            System.out.println("A is playing...");
            playerA.danhCo(scanner.nextInt(), scanner.nextInt(), vanco);
            System.out.println("B is playing...");
            playerB.danhCo(scanner.nextInt(), scanner.nextInt(), vanco);
            vanco.xuatBanCo();
        }
    }

    // khi nao van co ket thuc?
    // khi co 1 nguoi thang.
    // khi nao thi thang ?
    // khi co 5 con chess cung ki hieu lien tiep nhau + khong bi chan 2 dau.
    // khi nao thi co 5 con chess cung ki hieu lien tiep nhau ?
    //
}
