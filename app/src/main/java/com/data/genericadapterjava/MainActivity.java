package com.data.genericadapterjava;

import android.os.Bundle;

import com.data.genericadapter.adapter.GenericAdapter;
import com.data.genericadapterjava.databinding.ActivityMainBinding;
import com.data.genericadapterjava.databinding.UserDataUiBinding;
import com.data.genericadapterjava.model.UserModel;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    ArrayList<UserModel> userModelArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        createDataList();


    }

    public void createDataList() {
        //just a demo of data:)
        userModelArrayList = new ArrayList<>();
        userModelArrayList.add(new UserModel().setName("Maya").setAddress("Madhubani"));
        userModelArrayList.add(new UserModel().setName("Maya").setAddress("Madhubani"));
        userModelArrayList.add(new UserModel().setName("Maya").setAddress("Madhubani"));
        userModelArrayList.add(new UserModel().setName("Maya").setAddress("Madhubani"));
        userModelArrayList.add(new UserModel().setName("Maya").setAddress("Madhubani"));
        userModelArrayList.add(new UserModel().setName("Swati").setAddress("Delhi"));
        userModelArrayList.add(new UserModel().setName("Swati").setAddress("Delhi"));
        userModelArrayList.add(new UserModel().setName("Swati").setAddress("Delhi"));
        userModelArrayList.add(new UserModel().setName("Prachi").setAddress("Bangalore"));
        userModelArrayList.add(new UserModel().setName("Shilpa").setAddress("Pune"));
        userModelArrayList.add(new UserModel().setName("Shilpa").setAddress("Pune"));
        userModelArrayList.add(new UserModel().setName("Shilpa").setAddress("Pune"));
        userModelArrayList.add(new UserModel().setName("Suman").setAddress("Darbhanga"));
        userModelArrayList.add(new UserModel().setName("Suman").setAddress("Darbhanga"));
        userModelArrayList.add(new UserModel().setName("Suman").setAddress("Darbhanga"));

        // Layout Manager
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        binding.recyclerView.setAdapter(new GenericAdapter<UserModel, UserDataUiBinding>(this, userModelArrayList) {
            @Override
            public int getLayoutResId() {
                return R.layout.user_data_ui;
            }

            @Override
            public void onBindData(UserModel model, int position, UserDataUiBinding dataBinding) {
                dataBinding.txtName.setText(model.getName());
                dataBinding.txtAddress.setText(model.getAddress());
            }

            @Override
            public void onItemClick(UserModel model, int position) {

            }
        });
    }
}
