package chichachai.creditscoring.feature.UI;

import android.content.DialogInterface;
import android.util.Log;

import java.util.Arrays;

import chichachai.creditscoring.feature.Data.DataManager;
import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.UI.Base.BaseMvpPresenter;

public class MainActivityPresenter
        extends BaseMvpPresenter<MainActivityInterface.View>
        implements MainActivityInterface.Presenter {
    public MainActivityPresenter() {

    }

    public static MainActivityInterface.Presenter create() {
        return new MainActivityPresenter();
    }

    @Override
    public void attachView(MainActivityInterface.View mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Override
    public MainActivityInterface.View getView() throws NullPointerException {
        return super.getView();
    }

    @Override
    public void onViewCreate() {
        super.onViewCreate();
    }

    @Override
    public void onViewDestroy() {
        super.onViewDestroy();
    }

    @Override
    public void onViewStart() {
        super.onViewStart();
    }

    @Override
    public void onViewStop() {
        super.onViewStop();
    }

    @Override
    public Customer getCustomer() {
        return DataManager.getCustomer();
    }


    @Override
    public void onPressOk() {
        if (getCustomer().isAllFilled())
            getView().showConfirmDialog();
        else
            getView().showAlertItemNotFilledDialog();
    }

    @Override
    public void onConfirmDialog() {
        getView().showToast("answers : " + Arrays.toString(getCustomer().getScoreList()));
        getView().goLoginActivity();
    }

    @Override
    public void onCancelDialog() {
    }

    @Override
    public void onPressCancel() {
        getView().goLoginActivity();
    }
}
