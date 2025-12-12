/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */
class tblView {
   
    private String id, Iname, price;
    
    public tblView (String id, String Iname, String price){
       this.id=id;
       this.Iname=Iname;
       this.price=price;
    
    }
    public String getid(){
    return id;
    }
    public String getIname(){
    return Iname;
    }
    public String getprice(){
    return price;
    }
}

