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
public class login {
     private String userid;
    private int password;
    public String getuserid() {
		return userid;
	}
	public void setuserid(String userid) {
		this.userid = userid;
	}
        public int getpassword(){
                return password;
        }
        public void setpassword(int password){
                 this.password=password;
        }
    
}
