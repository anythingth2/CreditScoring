package chichachai.creditscoring.feature.UI.Base.Exception;

public class MvpPresenterNotCreateException extends RuntimeException {
    public MvpPresenterNotCreateException(){
        super("Please call createPresenter() before"+ " requesting data to the Presenter");
    }
}

