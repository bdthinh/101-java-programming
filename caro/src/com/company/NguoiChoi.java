package com.company;

import java.util.ArrayList;

/**
 * Created by thinhdbui on 3/4/17.
 */
public class NguoiChoi {
    char _kihieu;
    ArrayList<ViTri> _danhSachViTri;

    public NguoiChoi(char kihieu) {
        _kihieu = kihieu;
        _danhSachViTri = new ArrayList<ViTri>();
    }

    public void danhCo(int x, int y, VanCo vanco, NguoiChoi player) {
        ViTri vitri = new ViTri(x, y);
        _danhSachViTri.add(vitri);
        vanco.setViTri(vitri, _kihieu);
        int bienTrai = x;
        int bienPhai = x;
        for (int i = x; i >= 0 ; i--) {
            if(vanco.get_banco()[i][vanco.get_cot() - 1] != _kihieu) {
                bienTrai = i + 1;
                return;
            }
            bienTrai = i;
        }

        for (int i = x; i < vanco.get_dong(); i++) {
            if(vanco.get_banco()[i][vanco.get_cot() - 1] != _kihieu) {
                bienPhai = i - 1;
                return;
            }
            bienPhai = i;
        }
        if ((bienPhai - bienTrai) >= 5)
            if(bienTrai > 0 && vanco.get_banco()[bienTrai -1][vanco.get_cot() -1] != player._kihieu && bienPhai < (vanco.get_dong() - 1) && vanco.get_banco()[bienPhai + 1][vanco.get_cot() -1] != player._kihieu)
                vanco.set_ketThuc(true);

    }
}
