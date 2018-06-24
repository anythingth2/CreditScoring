package chichachai.creditscoring.feature.UI.Login;

import android.widget.EditText;

import chichachai.creditscoring.feature.UI.Base.BaseMvpInterface;

public class LoginActivityInterface {
    public interface View extends BaseMvpInterface.View {
       void goMainActivity();

    }

    public interface Presenter extends BaseMvpInterface.Presenter<LoginActivityInterface.View> {
        void onKeyReceive(int key);
    }
}
