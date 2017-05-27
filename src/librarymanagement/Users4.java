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
public class Users4 {
    
     private String book_id;
        private String callno;
         private String book_name;
          private String author;
           private String publisher;
            private String edition;
            
             
        private String student_id;
      
         private String student_name;
          private String contact;
           private String address;
            private String email;
            
              private String university;
              private String date_of_issue;
        

    
        public Users4 (String Book_ID, String Callno, String Book_Name, String Author, String Publisher, String Edition,String Student_ID,String Student_Name, String Contact, String Address, String Email, String University,String DateOfIssue)
    {
        this.date_of_issue = DateOfIssue;
        this.book_id = Book_ID;
        this.callno = Callno;
        this.book_name = Book_Name;
        this.author = Author;
        this.publisher = Publisher;
        this.edition = Edition;

        
        this.student_id = Student_ID;
        this.student_name = Student_Name;
        this.contact = Contact;
        this.address = Address;
        this.email = Email;
        this.university = University;

       
    }
      public String getBook_Id(){
            return book_id;
        }
         public String getCallno(){
            return callno;
        }
          public String getBook_Name(){
            return book_name;
        }
           public String getAuthor(){
            return author;
        }
            public String getEdition(){
            return edition;
        }
                public String getDateOfIssue(){
            return date_of_issue;
        }
          
                public String getPublisher(){
            return publisher;
        }
        public String getStudentId(){
            return student_id;
        }
        
          public String getStudentName(){
            return student_name;
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

    

