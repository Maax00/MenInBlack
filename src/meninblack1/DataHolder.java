/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack1;

/**
 *
 * @author maxli
 */


public class DataHolder {
    private static DataHolder instance;
    private String sharedData;

    private DataHolder() {
        // Private constructor to prevent instantiation
    }

    public static DataHolder getInstance() {
        if (instance == null) {
            instance = new DataHolder();
        }
        return instance;
    }

    public String getSharedData() {
        return sharedData;
    }

    public void setSharedData(String data) {
        this.sharedData = data;
    }
}