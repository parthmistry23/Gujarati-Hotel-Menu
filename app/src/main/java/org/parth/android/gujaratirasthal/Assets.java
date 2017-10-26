package org.parth.android.gujaratirasthal;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by parth on 10/17/2017.
 */
public class Assets  {
    public static List<Main> checkedItems = new ArrayList<>();


    /*public Assets(Parcel in) {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        for(int j =0; j< Assets.checkedItems.size(); j++){
            dest.writeString(checkedItems.get(j).getItems());
            dest.writeInt(checkedItems.get(j).getPrice());
        }

    }
    public static final Parcelable.Creator<Assets> CREATOR = new Parcelable.Creator<Assets>() {
        public Assets createFromParcel(Parcel in) {
            return new Assets(in);
        }

        public Assets[] newArray(int size) {

            return new Assets[size];
        }

    }; */



}
