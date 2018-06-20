package chichachai.creditscoring.feature.UI.Base.Exception;

public class MvpNotSetLayoutException  extends RuntimeException{

    public MvpNotSetLayoutException() {
        super("getLayoutView() not return 0");
    }
}
