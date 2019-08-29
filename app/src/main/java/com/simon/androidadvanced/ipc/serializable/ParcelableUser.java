package com.simon.androidadvanced.ipc.serializable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableUser implements Parcelable {
    private String userName;

    protected ParcelableUser(Parcel in) {
        userName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ParcelableUser> CREATOR = new Creator<ParcelableUser>() {
        @Override
        public ParcelableUser createFromParcel(Parcel in) {
            return new ParcelableUser(in);
        }

        @Override
        public ParcelableUser[] newArray(int size) {
            return new ParcelableUser[size];
        }
    };
}
