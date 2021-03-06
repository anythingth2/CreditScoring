package chichachai.creditscoring.feature.UI.Adapter.Question;

import java.util.List;

import chichachai.creditscoring.feature.UI.Adapter.Base.BaseItem;

public class QuestionItem extends BaseItem {

    public static final int CHECK = 596;
    public static final int RADIO = 537;

    String questionTitle;
    int type;
    List<String> choices;

    public QuestionItem(String question, int type,List<String> answer) {
        this.questionTitle = question;
        this.type = type;
        this.choices = answer;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public List<String> getChoices() {
        return choices;
    }
}
