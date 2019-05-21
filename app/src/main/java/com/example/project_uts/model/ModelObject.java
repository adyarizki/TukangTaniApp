package com.example.project_uts.model;

import com.example.project_uts.R;

public enum ModelObject {
    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/

   RED(R.string.red, R.layout.splash_1),
   BLUE(R.string.blue, R.layout.splash_2),
   GREEN(R.string.green, R.layout.splash_3);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
