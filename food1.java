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
public class food {
    private String foodname,type,sizetype;
    private int foodid,quantity,price;
    public String getfoodName() {
		return foodname;
	}
	public void setfoodName(String foodname) {
		this.foodname = foodname;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getsizetype() {
		return sizetype;
	}
	public void setsizetype(String sizetype) {
		this.sizetype = sizetype;
        }
        public int getfoodid(){
                return foodid;
        }
        public void setfoodid(int foodid){
                 this.foodid=foodid;
        }
         public int getquantity(){
                return quantity;
        }
        public void setquantity(int quantity){
                 this.quantity=quantity;
        }
         public int getprice(){
                return price;
        }
        public void setprice(int price){
                 this.price=price;
        }
                
	}
