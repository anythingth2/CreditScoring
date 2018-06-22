package chichachai.creditscoring.feature.UI.Login;

import chichachai.creditscoring.feature.UI.Base.BaseMvpPresenter;

public class LoginActivityPresenter extends BaseMvpPresenter<LoginActivityInterface.View>
        implements LoginActivityInterface.Presenter
{
    public LoginActivityPresenter() {
    }

    public static LoginActivityPresenter create(){
        return new LoginActivityPresenter();
    }
}
