package chichachai.creditscoring.feature.UI.Login;

import chichachai.creditscoring.feature.UI.Base.BaseMvpInterface;

public class LoginActivityInterface {
    public interface View extends BaseMvpInterface.View {

    }

    public interface Presenter extends BaseMvpInterface.Presenter<LoginActivityInterface.View> {
        void onKeyReceive(int key);
    }
}
