package chichachai.creditscoring.feature.UI;

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
}
