package chichachai.creditscoring.feature.Data.Models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer implements Parcelable {


    private String name;
    private int id;

    int[] scoreList;

    public Customer() {
        super();
    }

    public Customer(int id, String name, int numberQuestion) {
        this.name = name;
        this.id = id;
        this.scoreList = new int[numberQuestion];
        Arrays.fill(scoreList, -1);
    }

    protected Customer(Parcel in) {
        name = in.readString();
        id = in.readInt();
    }

    public static final Creator<Customer> CREATOR = new Creator<Customer>() {
        @Override
        public Customer createFromParcel(Parcel in) {
            return new Customer(in);
        }

        @Override
        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(id);
    }

    public void setScore(int pos, int score) {
        this.scoreList[pos] = score;
    }

    public int[] getScoreList() {
        return scoreList;
    }

    public boolean isAllFilled() {
        return Arrays.binarySearch(getScoreList(), -1) < 0;
    }
}
