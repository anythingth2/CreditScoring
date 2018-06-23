package chichachai.creditscoring.feature.UI.Adapter.Question;

import java.util.List;

import chichachai.creditscoring.feature.Data.DataManager;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseItem;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseMvpListAdapterInterface;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseMvpListAdapterPresenter;

public class QuestionAdapterPresenter<A extends QuestionAdapterInterface.Adapter>
        extends BaseMvpListAdapterPresenter<A> implements QuestionAdapterInterface.Presenter<A> {



    private List<QuestionItem> questionItemList;

    public QuestionAdapterPresenter() {
        super();
    }

    public static QuestionAdapterInterface.Presenter create(){
        return new QuestionAdapterPresenter();
    }

    @Override
    public List<BaseItem> getItems() {
        return super.getItems();
    }

    public List<QuestionItem> getQuestionItem(){
       return questionItemList;
    }



    public void setQuestionItem(List<QuestionItem> items){
        this.questionItemList = items;
    }

    @Override
    public void setScore(int pos, int score) {
        DataManager.getCustomer().setScore(pos,score);
    }

    @Override
    public void setItems(List<BaseItem> items, boolean isNextItemAvailable) {

    }






}

