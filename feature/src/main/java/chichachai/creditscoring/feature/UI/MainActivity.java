package chichachai.creditscoring.feature.UI;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;

import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionAdapter;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainActivityInterface.Presenter>
        implements MainActivityInterface.View {
    private static final String TAG = MainActivity.class.getName();
    RecyclerView rvQuestion;
    QuestionAdapter questionAdapter;

    ImageButton btOk, btCancel;

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
        btOk = findViewById(R.id.main_ok_button);
        btCancel = findViewById(R.id.main_cancel_button);
    }

    void setupQuestion() {
        ArrayList<QuestionItem> questionItems = new ArrayList<>();
        questionItems.add(new QuestionItem("Question1"
                , QuestionItem.RADIO
                , Arrays.asList("Ans1", "Ans2")
        ));
        questionItems.add(new QuestionItem("Question2"
                , QuestionItem.RADIO
                , Arrays.asList("Ans3", "Ans4", "EIEI")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionItems.add(new QuestionItem("Question3"
                , QuestionItem.RADIO
                , Arrays.asList("Ans5", "Ans6")
        ));
        questionAdapter = new QuestionAdapter(questionItems);
    }

    @Override
    public void setupInstance() {
        setupQuestion();

    }

    @Override
    public void setupView() {
        rvQuestion.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvQuestion.setAdapter(questionAdapter);
        rvQuestion.setNestedScrollingEnabled(false);

        btOk.setOnClickListener(okOnClickListener());
        btCancel.setOnClickListener(cancelOnClickListener());

    }

    @Override
    public void initialize() {

    }

    View.OnClickListener okOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getPresenter().onPressOk();
            }
        };
    }

    View.OnClickListener cancelOnClickListener() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideProgressBar();
                Log.d(TAG, "hide");
            }
        };
    }

}
