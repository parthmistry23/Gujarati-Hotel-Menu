package org.parth.android.gujaratirasthal;

/**
 * Created by parth on 10/9/2017.
 */
public class Main {

    private int mImage;

    private String mText;

    private boolean selected;

    private String mItems;

    private int mPrice;

    public Main(int vImage, String vText) {
        this.mImage = vImage;
        this.mText = vText;
    }

    public Main() {
    }

    public Main(String vItems, int vPrice) {
        this.mItems = vItems;
        this.mPrice = vPrice;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean isChecked) {
        this.setSelected(isChecked);
    }

    public String getItems() {
        return mItems;
    }

    public int getPrice() {
        return mPrice;
    }

    public int getImage() {
        return mImage;
    }

    public String getText() {
        return mText;
    }
}
