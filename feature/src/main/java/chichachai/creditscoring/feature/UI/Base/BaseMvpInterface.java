package chichachai.creditscoring.feature.UI.Base;

public class BaseMvpInterface {

    interface View {
        Presenter getPresenter();
    }

    interface Presenter<V extends BaseMvpInterface.View> {
        void attachView(V mvpView);

        void detachView();

        V getView();

        void onViewCreate();

        void onViewDestroy();

        void onViewStart();

        void onVIewStop();
    }
}
