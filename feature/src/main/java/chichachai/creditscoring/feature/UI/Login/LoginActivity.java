package chichachai.creditscoring.feature.UI.Login;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;

import chichachai.creditscoring.feature.Data.DataManager;
import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;
import chichachai.creditscoring.feature.UI.MainActivity;

public class LoginActivity extends BaseMvpActivity<LoginActivityInterface.Presenter> {
    private static final String TAG = LoginActivity.class.getName();
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

        etLogin.addTextChangedListener(onTextChangeListener());
    }

    @Override
    public void initialize() {

    }

    TextWatcher onTextChangeListener() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence text, int i, int i1, int i2) {
                if (text.length() >= 8) {
                    getPresenter().onKeyReceive(Integer.parseInt(text.toString()));
                    goMainActivity();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }

    void goMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
