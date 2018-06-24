package chichachai.creditscoring.feature.UI.Login;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;
import chichachai.creditscoring.feature.UI.MainActivity;

public class LoginActivity extends BaseMvpActivity<LoginActivityInterface.Presenter>
implements LoginActivityInterface.View{
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



    public void goMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
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
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }


}
