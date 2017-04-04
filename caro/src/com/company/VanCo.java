package com.company;

/**
 * Created by thinhdbui on 3/4/17.
 */
public class VanCo {
    int _dong;
    int _cot;
    boolean _ketThuc;

    public boolean is_ketThuc() {
        return _ketThuc;
    }

    public void set_ketThuc(boolean _ketThuc) {
        this._ketThuc = _ketThuc;
    }

    char[][] _banco;

    public int get_dong() {
        return _dong;
    }

    public void set_dong(int _dong) {
        this._dong = _dong;
    }

    public int get_cot() {
        return _cot;
    }

    public void set_cot(int _cot) {
        this._cot = _cot;
    }

    public char[][] get_banco() {
        return _banco;
    }

    public VanCo(int dong, int cot) {
        _dong = dong;
        _cot = cot;
        _banco = new char[dong][cot];
        for (int i = 0; i < _dong; i++) {
            for (int j = 0; j < _cot; j++) {
                _banco[i][j] = '.';
            }
        }
        _ketThuc = false;
    }

    public void xuatBanCo() {
        for (int i = 0; i < _dong; i++) {
            for (int j = 0; j < _cot; j++) {
                System.out.print(_banco[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void setViTri(ViTri vitri, char kihieu) {
        _banco[vitri.get_x()][vitri.get_y()] = kihieu;
    }
}
