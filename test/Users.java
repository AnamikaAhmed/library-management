/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import librarymanagement.*;

/**
 *
 * @author Anamika Ahmed
 */
public class Users {
    
    private String id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String contact;
    
        public Users(String ID, String Name, String Password, String Email, String Address, String Contact)
    {
        this.id = ID;
        this.name = Name;
        this.password = Password;
        this.email = Email;
        this.address = Address;
        this.contact = Contact;
        
    }
    
        public String getId(){
            return id;
        }
         public String getName(){
            return name;
        }
          public String getPassword(){
            return password;
        }
           public String getEmail(){
            return email;
        }
            public String getAddres(){
            return address;
        }
             public String getContact(){
            return contact;
        }
    
}
