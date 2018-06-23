package chichachai.creditscoring.feature.UI.Adapter.Question;

import java.util.List;

import chichachai.creditscoring.feature.UI.Adapter.Base.BaseItem;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseMvpListAdapterInterface;

public class QuestionAdapterInterface {
    public interface Adapter extends BaseMvpListAdapterInterface.Adapter {


    }

    public interface Presenter<A extends QuestionAdapterInterface.Adapter>
            extends BaseMvpListAdapterInterface.Presenter<A> {
        void setItems(List<BaseItem> items, boolean isNextItemAvailable);

        List<QuestionItem> getQuestionItem();

        void setQuestionItem(List<QuestionItem> items);

        void setScore(int pos,int score);
    }
}
