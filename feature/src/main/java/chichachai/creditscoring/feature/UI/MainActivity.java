package chichachai.creditscoring.feature.UI;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;

import chichachai.creditscoring.feature.Data.Models.Customer;
import chichachai.creditscoring.feature.R;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionAdapter;
import chichachai.creditscoring.feature.UI.Adapter.Question.QuestionItem;
import chichachai.creditscoring.feature.UI.Base.BaseMvpActivity;
import chichachai.creditscoring.feature.UI.Login.LoginActivity;

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
                getPresenter().onPressCancel();
            }
        };
    }

    public void showConfirmDialog() {
        setupDialog(getString(R.string.main_confirm_dialog_title)
                , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        getPresenter().onConfirmDialog();
                    }
                }
                , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        getPresenter().onCancelDialog();
                    }
                });
        showDialog();
    }

    @Override
    public void showAlertItemNotFilledDialog() {
        setupDialog(getString(R.string.main_alert_fill_dialog_title));
        showDialog();
    }

    public void goLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
