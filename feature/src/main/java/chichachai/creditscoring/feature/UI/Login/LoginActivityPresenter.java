package chichachai.creditscoring.feature.UI.Login;

import android.util.Log;

import chichachai.creditscoring.feature.Data.DataManager;
import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.UI.Base.BaseMvpPresenter;

public class LoginActivityPresenter extends BaseMvpPresenter<LoginActivityInterface.View>
        implements LoginActivityInterface.Presenter {
    public LoginActivityPresenter() {
    }

    public static LoginActivityPresenter create() {
        return new LoginActivityPresenter();
    }

    @Override
    public void onKeyReceive(int key) {
        Log.i("Key", "" + key);
        DataManager.setCustomer(new Customer(12345678, "Customer1"));
    }


}
