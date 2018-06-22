package chichachai.creditscoring.feature.UI.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import chichachai.creditscoring.feature.Models.Customer;
import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;
import chichachai.creditscoring.feature.UI.MainActivity;

public class LoginActivity extends BaseMvpActivity<LoginActivityInterface.Presenter> {

    EditText etLogin;

    @Override
    public LoginActivityInterface.Presenter createPresenter() {
        return LoginActivityPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_login;
    }

    @Override
    public void bindView() {
        etLogin = findViewById(R.id.login_id);
    }


    @Override
    public void setupInstance() {

    }

    @Override
    public void setupView() {
        etLogin.setOnKeyListener(loginOnKeyListener());
    }

    @Override
    public void initialize() {

    }

    EditText.OnKeyListener loginOnKeyListener() {
        return new EditText.OnKeyListener() {

            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                EditText editText = (EditText) view;
                int textLength = editText.getText().length();
                if (textLength >= 8) {
                    goMainActivity();
                }
                return false;
            }
        };
    }

    void goMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
