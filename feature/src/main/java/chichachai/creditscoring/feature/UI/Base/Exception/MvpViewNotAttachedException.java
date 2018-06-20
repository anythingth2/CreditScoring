package chichachai.creditscoring.feature.UI.Base.Exception;

public class MvpViewNotAttachedException extends RuntimeException {
    public MvpViewNotAttachedException() {
        super("Please call Presenter.attachView(MvpBaseView) before" +
                " requesting data to the View");
    }
}
