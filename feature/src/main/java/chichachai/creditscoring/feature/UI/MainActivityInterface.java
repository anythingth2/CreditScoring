package chichachai.creditscoring.feature.UI;

import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.UI.Base.BaseMvpInterface;

public class MainActivityInterface {
    public interface View extends BaseMvpInterface.View {

    }

    public interface Presenter extends BaseMvpInterface.Presenter<MainActivityInterface.View> {
        Customer getCustomer();

        void onPressOk();
    }
}
