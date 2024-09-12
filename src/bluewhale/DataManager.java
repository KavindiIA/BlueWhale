/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bluewhale;

/**
 *
 * @author Kavindi
 */
public class DataManager {
    private static double priceK;
    private static Object[] roomInfo;
    private static int checkInDateData;
    private static int checkOutDateData;
    private static Object[] pricePerDayData;
    
    public static Object[] getPricePerDayData() {
        return pricePerDayData;
    }
    
    public static void setPricePerDayData(Object[] priceperdaydata) {
        pricePerDayData = priceperdaydata;
    }
    
    public static int getCheckOutDateData() {
        return checkOutDateData;
    }
    
    public static void setCheckOutDateData(int checkoutdatedata) {
        checkOutDateData = checkoutdatedata;
    }
    
    public static int getCheckInDateData() {
        return checkInDateData;
    }
    
    public static void setCheckInDateData(int checkindatedata) {
        checkInDateData = checkindatedata;
    }
    
    public static Object[] getRoomInfo() {
        return roomInfo;
    }
    
    public static void setRoomInfo(Object[] roominfo) {
        roomInfo = roominfo;
    }

    public static double getPriceK() {
        return priceK;
    }
    
    public static void setPriceK(double pricek) {
        priceK = pricek;
    }
    
}
