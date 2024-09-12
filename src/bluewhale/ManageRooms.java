/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bluewhale;

/**
 *
 * @author Kavindi
 */
public class ManageRooms {
    private String roomNo;
    private String roomName;
    private String roomType;
    private double Price;
    
   
    public ManageRooms(String roomNo,String roomName,String roomType,double Price){
        this.roomNo=roomNo;
        this.roomName=roomName;
        this.roomType=roomType;
        this.Price=Price;
    }
    public void setRoomNo(String roomNo){
    this.roomNo=roomNo;
    }
    public void setRoomName(String roomName){
    this.roomName=roomName;
    }
    public void setRoomType(String roomType){
    this.roomType=roomType;
    }
    public void setContact(double Price){
    this.Price=Price;
    }
    public String getRoomNo(){
    return roomNo;
    }
    public String getRoomName(){
    return roomName;
    }
    public String getRoomType(){
    return roomType;
    }
    public double getPrice(){
    return Price;
    }
    public String toString(){
    return "Student{" +"id = " + roomNo+ '\'' + ",name = "+roomName+ '\'' + ",address = "+roomType+ '\'' + ",contact = "+Price+ '}';
        }
}
   
