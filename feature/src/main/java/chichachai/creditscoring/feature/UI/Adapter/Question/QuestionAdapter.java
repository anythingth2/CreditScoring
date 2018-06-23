package chichachai.creditscoring.feature.UI.Adapter.Question;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import chichachai.creditscoring.feature.UI.Adapter.Base.BaseMvpListAdapter;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseMvpListAdapterInterface;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseViewHolder;
import chichachai.creditscoring.feature.UI.Adapter.Question.Holder.QuestionViewHolder;

public class QuestionAdapter
        extends BaseMvpListAdapter<QuestionViewHolder, QuestionAdapterInterface.Presenter>
        implements QuestionAdapterInterface.Adapter {


    public QuestionAdapter(List<QuestionItem> questionItemList) {
        super();
        getPresenter().setQuestionItem(questionItemList);
    }

    @Override
    public QuestionAdapterInterface.Presenter createPresenter() {
        return QuestionAdapterPresenter.create();
    }

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuestionViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {
        holder.setQuestion((QuestionItem) getPresenter().getQuestionItem().get(position));
    }

    @Override
    public int getItemCount() {
        return getPresenter().getQuestionItem().size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
