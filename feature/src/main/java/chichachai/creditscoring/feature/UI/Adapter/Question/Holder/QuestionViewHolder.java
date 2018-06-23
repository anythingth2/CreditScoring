package chichachai.creditscoring.feature.UI.Adapter.Question.Holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseViewHolder;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;

public class QuestionViewHolder extends BaseViewHolder {

    TextView tvTitle;
    private RadioGroup rdgChoice;
    private List<RadioButton> rdChoiceList;


    public QuestionViewHolder(ViewGroup parent) {
        super(parent, R.layout.holder_question);
        setupInstance();
        setupView();
    }

    @Override
    public void bindView(View view) {
        tvTitle = view.findViewById(R.id.holder_question_title);
        rdgChoice = view.findViewById(R.id.holder_choice_group);
    }

    private void addChoice(String choiceText) {
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setText(choiceText);

        rdChoiceList.add(radioButton);
        rdgChoice.addView(radioButton);
    }

    private void clearChoice() {
        rdgChoice.removeAllViews();
    }

    private void setupChoiceList(List<String> choiceList) {
        clearChoice();
        for (String choiceText : choiceList) {
            addChoice(choiceText);
        }
    }

    private void setupInstance() {
        rdChoiceList = new ArrayList<>();
    }

    private void setupView() {
    }

    public void setQuestion(QuestionItem item) {
        tvTitle.setText(item.getQuestionTitle());
        setupChoiceList(item.getChoices());
    }
}
