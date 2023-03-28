package com.hsf.datastructuretest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hsf.datastructuretest.databinding.ActivityMainBinding;
import com.hsf.datastructuretest.single_linked_list.LinkedListNode;
import com.hsf.datastructuretest.single_linked_list.SingleLInkedList;
import com.hsf.datastructuretest.util.NumberUtils;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    SingleLInkedList singleLInkedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        singleLInkedList = new SingleLInkedList();

        binding.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Daisy", singleLInkedList.toString());
            }
        });

        binding.btnAddNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleLInkedList.add(NumberUtils.getRandomNumber());
            }
        });

        binding.btnAddIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleLInkedList.add(0, 333);
            }
        });

        binding.btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Daisy", "获得了：" + singleLInkedList.get(2));
            }
        });

        binding.btnGetIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer inputValue = Integer.valueOf(String.valueOf(binding.edtElement.getText()));
                Log.d("Daisy", "找到了位置：" + singleLInkedList.indexOf(inputValue));
            }
        });

        binding.btnDeleteIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Daisy", "删除的元素值是：" + singleLInkedList.remove(1));
            }
        });

        binding.btnDeleteElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer inputValue = Integer.valueOf(String.valueOf(binding.edtElement.getText()));
                Log.d("Daisy", "是否存在该元素：" + singleLInkedList.remove(inputValue));
            }
        });

        binding.btnModify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("Daisy", "修改之前的元素：" + singleLInkedList.set(1, 32));
            }
        });
    }
}