/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Sayantan
 */
public class booking {
     private String customername,street,city,landmark;
    private int foodid,orderid,pincode,mobilenumber,date,time;
    public String getcustomername() {
		return customername;
	}
	public void setcustomername(String customername) {
		this.customername = customername;
	}
	public String getstreet() {
		return street;
	}
	public void setstreet(String street) {
		this.street = street;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
        }
        public String getlandmark() {
		return landmark;
	}
	public void setlandmark(String landmark) {
		this.landmark = landmark;
        }
        public int getfoodid(){
                return foodid;
        }
        public void setfoodid(int foodid){
                 this.foodid=foodid;
        }
         public int getpincode(){
                return pincode;
        }
        public void setpincode(int pincode){
                 this.pincode=pincode;
        }
         public int getorderid(){
                return orderid;
        }
        public void setorderid(int orderid){
                 this.orderid=orderid;
        }
        public int getmobilenumber(){
                return mobilenumber;
        }
        public void setmobilenumber(int mobilenumber){
                 this.mobilenumber=mobilenumber;
        }
        public int getdate(){
                return date;
        }
        public void setdate(int date){
                 this.date=date;
        }
        public int gettime(){
                return time;
        }
        public void settime(int time){
                 this.time=time;
        }
    
}
