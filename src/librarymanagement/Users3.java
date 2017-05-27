/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import com.sun.scenario.effect.impl.prism.ps.PPSDrawable;

/**
 *
 * @author Anamika Ahmed
 */
public class Users3 {
        private String id;
      
         private String name;
          private String contact;
           private String address;
            private String email;
            
              private String university;
        

    
        public Users3 (String ID,String Name, String Contact, String Address, String Email, String University)
    {
        this.id = ID;
        this.name = Name;
        this.contact = Contact;
        this.address = Address;
        this.email = Email;
        this.university = University;

       
    }
    
        public String getId(){
            return id;
        }
        
          public String getName(){
            return name;
        }
           public String getContact(){
            return contact;
        }
            public String getEmail(){
            return email;
        }
             
             public String getAddress(){
            return address;
        }
                public String getUniversity(){
            return university;
        }
    
}

    

