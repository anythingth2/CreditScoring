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

    boolean isAllFilled() {
        return Arrays.binarySearch(getCustomer().getScoreList(), -1) < 0;
    }

    @Override
    public void onPressOk() {

        getView().showDialog();
    }

    @Override
    public void onConfirmDialog() {

    }

    @Override
    public void onCancelDialog() {


    }


}
