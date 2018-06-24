package chichachai.creditscoring.feature.UI;

import android.content.DialogInterface;

import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.UI.Base.BaseMvpInterface;

public class MainActivityInterface {
    public interface View extends BaseMvpInterface.View {
        void showDialog();

        void goLoginActivity();

        void showConfirmDialog();
        void showAlertItemNotFilledDialog();
    }

    public interface Presenter extends BaseMvpInterface.Presenter<MainActivityInterface.View> {
        Customer getCustomer();

        void onPressOk();

        void onConfirmDialog();

        void onCancelDialog();

        void onPressCancel();
    }
}
