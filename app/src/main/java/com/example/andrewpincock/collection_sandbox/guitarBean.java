package com.example.andrewpincock.collection_sandbox;

/**
 * Created by AndrewPincock on 1/21/15.
 */
public class guitarBean implements java.io.Serializable{

    String guitarBrand;
    String guitarModel;
    int year;

    public guitarBean() {
    }
    public String getGuitarBrand() {
        return guitarBrand;
    }
    public void setGuitarBrand(String guitarBrand) {
        this.guitarBrand = guitarBrand;
    }

    public String getGuitarModel() {
        return guitarModel;
    }
    public void setGuitarModel(String guitarModel) {
        this.guitarModel = guitarModel;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}
