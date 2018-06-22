package chichachai.creditscoring.feature.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Customer implements Parcelable {


    private String name;
    private int id;

    public Customer() {
        super();
    }

    public Customer(int id, String name) {
        this.name = name;
        this.id = id;
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
}
