package chichachai.creditscoring.feature.UI.Base;

public class BaseMvpInterface {

    public interface View {
        Presenter getPresenter();

        void showToast(String text);
    }

    public interface Presenter<V extends BaseMvpInterface.View> {
        void attachView(V mvpView);

        void detachView();

        V getView();

        void onViewCreate();

        void onViewDestroy();

        void onViewStart();

        void onViewStop();
    }
}
