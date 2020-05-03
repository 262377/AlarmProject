package com.example.deu_scrap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragResult extends Fragment {
    private View view;

    public static FragResult newinstance() {
        FragResult fragResult = new FragResult();
        return fragResult;
    }// 어댑터에 맞춰 주기적으로 인스턴스가 생성되면서 프래그먼트를 교체할 때 수행

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_result, container, false);

        return view;
    }
}
