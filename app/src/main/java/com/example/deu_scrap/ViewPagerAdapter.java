package com.example.deu_scrap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트 교체를 보여주기 위한 구현
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragAlarm.newinstance();
            case 1:
                return FragResult.newinstance();
            case 2:
                return FragSetting.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    // 상단 탭 레이아웃 인디케이터 쪽에 텍스트 선언해주는 곳
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Alarm";
            case 1:
                return "Result";
            case 2:
                return "Setting";
            default:
                return null;
        }
    }
}
