package chichachai.creditscoring.feature.UI.Base;

import java.lang.ref.WeakReference;

import chichachai.creditscoring.feature.UI.Base.Exception.MvpViewNotAttachedException;

public abstract class BaseMvpPresenter<V extends BaseMvpInterface.View>
        implements BaseMvpInterface.Presenter<V> {
    private WeakReference<V> mMvpView;


    @Override
    public void attachView(V mvpView) {
        mMvpView = new WeakReference<>(mvpView);
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public V getView() throws NullPointerException {
        if (mMvpView != null) return mMvpView.get();
        throw new MvpViewNotAttachedException();
    }

    @Override
    public void onViewCreate() {

    }

    @Override
    public void onViewDestroy() {

    }

    @Override
    public void onViewStart() {

    }

    @Override
    public void onViewStop() {

    }
}
