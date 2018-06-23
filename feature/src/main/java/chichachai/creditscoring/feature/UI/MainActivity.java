package chichachai.creditscoring.feature.UI;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Arrays;

import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionAdapter;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainActivityInterface.Presenter>
        implements MainActivityInterface.View {

    RecyclerView rvQuestion;
    QuestionAdapter questionAdapter;
    FrameLayout contentFrame;



    Customer customer;

    @Override
    public MainActivityInterface.Presenter createPresenter() {
        return MainActivityPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    public void bindView() {
        rvQuestion = findViewById(R.id.rv_question);
        contentFrame = findViewById(R.id.content_frame);
    }


    @Override
    public void setupInstance() {
        rvQuestion.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvQuestion.setAdapter(questionAdapter);


    }

    void setupQuestion() {
        ArrayList<QuestionItem> questionItems = new ArrayList<>();
        questionItems.add(new QuestionItem("Question1"
                , QuestionItem.RADIO
                , Arrays.asList("Ans1", "Ans2")
        ));
        questionItems.add(new QuestionItem("Question2"
                , QuestionItem.RADIO
                , Arrays.asList("Ans3", "Ans4")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionAdapter = new QuestionAdapter(questionItems);
    }

    @Override
    public void setupView() {
        setupQuestion();

    }

    @Override
    public void initialize() {

    }




}
