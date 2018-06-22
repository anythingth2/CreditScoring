package chichachai.creditscoring.feature.UI.Adapter.Question.Holder;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseViewHolder;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;

public class QuestionViewHolder extends BaseViewHolder {

    TextView tvTitle;
    ExpandableListView elvAnswersList;

    public QuestionViewHolder(ViewGroup parent) {
        super(parent, R.layout.holder_question);
    }

    @Override
    public void bindView(View view) {
        tvTitle = view.findViewById(R.id.holder_question_title);
//        elvAnswersList = view.findViewById(R.id.holder_answerlist);
    }

    public void setQuestion(QuestionItem item){
        tvTitle.setText(item.getQuestionTitle());
        Log.i("item",item.getQuestionTitle());
    }
}
