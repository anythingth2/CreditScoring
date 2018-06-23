package chichachai.creditscoring.feature.UI.Adapter.Question.Holder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Base.BaseViewHolder;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionAdapterInterface;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;

public class QuestionViewHolder<A extends QuestionAdapterInterface.Adapter, P extends QuestionAdapterInterface.Presenter<A>>
        extends BaseViewHolder {
    private static final String TAG = QuestionViewHolder.class.getName();

    private P presenter;

    TextView tvTitle;
    private RadioGroup rdgChoice;
    private List<RadioButton> rdChoiceList;

    private HashMap<Integer, Integer> mapChoice;
    private int countChoice;

    private int questionOrder;


    public QuestionViewHolder(ViewGroup parent, P presenter) {
        super(parent, R.layout.holder_question);
        this.presenter = presenter;
        setupInstance();
        setupView();
    }

    public P getPresenter() {
        return presenter;
    }

    public void setPresenter(P presenter) {
        this.presenter = presenter;
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

        mapChoice.put(radioButton.getId(), countChoice++);
    }

    private void clearChoice() {
        rdgChoice.removeAllViews();
        mapChoice = new HashMap<Integer, Integer>();
        countChoice = 0;
    }

    private void setupChoiceList(List<String> choiceList) {
        clearChoice();
        for (String choiceText : choiceList) {
            addChoice(choiceText);
        }
    }

    private void setupInstance() {
        rdChoiceList = new ArrayList<>();
        mapChoice = new HashMap<Integer, Integer>();
        getPresenter().setScore(questionOrder, getCheckedChoice());
    }

    private void setupView() {
        rdgChoice.setOnCheckedChangeListener(onChoiceCheckedListener());
    }

    public void setQuestion(QuestionItem item, int questionOrder) {
        tvTitle.setText(item.getQuestionTitle());
        setupChoiceList(item.getChoices());
        this.questionOrder = questionOrder;
    }

    public int getCheckedChoice() {

        if (rdgChoice.getCheckedRadioButtonId() != -1)
            return mapChoice.get(rdgChoice.getCheckedRadioButtonId());
        else
            return -1;
    }

    RadioGroup.OnCheckedChangeListener onChoiceCheckedListener() {
        return new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                getPresenter().setScore(questionOrder, getCheckedChoice());
            }
        };
    }
}
