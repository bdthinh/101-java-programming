package com.company;

/**
 * Created by thinhdbui on 27/3/17.
 */
public class PhanSo {
    int _tu;
    int _mau;

    /**
     *
     * @param tu
     * @param mau
     */
    public PhanSo(int tu, int mau) {
        _tu = tu;
        _mau = mau;
    }

    /**
     *
     * @param another
     */
    public PhanSo(PhanSo another) {
        _tu = another._tu;
        _mau = another._mau;
    }

    public int get_tu() {
        return _tu;
    }

    public void set_tu(int _tu) {
        this._tu = _tu;
    }

    public int get_mau() {
        return _mau;
    }

    public void set_mau(int _mau) {
        this._mau = _mau;
    }


}
