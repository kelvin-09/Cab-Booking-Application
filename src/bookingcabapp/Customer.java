/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcabapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Customer extends Thread{
        public String customerName,driver,customerEmail,customerPasswd,customerPhone;
        public int customerWallet;
       
        
        
        
        
        public Customer(String customerName,String customerEmail,String customerPasswd,String customerPhone, int customerWallet)
        {
            this.customerName = customerName;
            this.driver="";
            this.customerEmail=customerEmail;
            this.customerWallet=customerWallet;
            this.customerPasswd=customerPasswd;
            this.customerPhone=customerPhone;
        }
        public int BookACab(int pi){
            int locationArr[]=new int[10];
            int ratingArr[]=new int [10];
            int avalArr[]=new int [10];
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbookingapp?serverTimezone=UTC","root","preet@0431");
            ResultSet rs;
            String query = "select rating,location,Aval from driver";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            int i=0;
            while(rs.next()){
                locationArr[i]=rs.getInt("location");
                ratingArr[i]=rs.getInt("rating");
                avalArr[i]=rs.getInt("Aval");
                ++i;
            }
            st.close();
            con.close();
            }
            catch(Exception e){
            System.out.println("Exception:"+e);
            }   
            Location lo =new Location();
            int minDist=100,maxRating=0,driverIndex=-1;
            for(int j=0;j<3;++j){
                if((lo.getDistance(pi,locationArr[j])<minDist) && avalArr[j]==1){
                        minDist=lo.getDistance(pi,locationArr[j]);
                        maxRating=ratingArr[j];
                        driverIndex=j;
                        continue;
                }
                else if(lo.getDistance(pi,locationArr[j])==minDist  && ratingArr[j]>maxRating && avalArr[j]==1){
                         maxRating=ratingArr[j];
                         driverIndex=j;
                }
            }
            return driverIndex;
        }

    
        
        Customer(String string, String string0, String string1, String string2, String string3, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
        
        
        
        
        
        public  int getWallet(){
            return customerWallet;
        }
        public void reduceWallet(int fare){
            customerWallet = customerWallet - fare;
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbookingapp?serverTimezone=UTC","root","preet@0431");
            String query = "update cabbookingapp.userdetails set wallet = ? where username = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, customerWallet);
            st.setString(2, customerName);
            int count = st.executeUpdate();
            st.close();
            con.close();
            }
            catch(Exception e){
            System.out.println("Exception:"+e);
            }
        }
        public void addWallet(int addToWallet)
        {
            customerWallet = customerWallet + addToWallet;
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbookingapp?serverTimezone=UTC","root","preet@0431");
            String query = "update cabbookingapp.userdetails set wallet = ? where username = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, customerWallet);
            st.setString(2, customerName);
            int count = st.executeUpdate();
            st.close();
            con.close();
            }
            catch(Exception e){
            System.out.println("Exception:"+e);
            }
          
        }
       public String getUsername(){
           return customerName;
       }
       public String getEmail(){
           return customerEmail;
       }
       public String getPhone(){
           return customerPhone;
       }
       public String getPassword(){
           return customerPasswd;
       }
       public void changeLoginStatus(int stat){
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbookingapp?serverTimezone=UTC","root","preet@0431");
            String query = "update cabbookingapp.userdetails set loginstatus = ? where username = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, stat);
            st.setString(2, customerName);
            int count = st.executeUpdate();
            st.close();
            con.close();
            }
            catch(Exception e){
            System.out.println("Exception:"+e);
            }
       }
}
