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
public class Users2 {
        private String id;
        private String callno;
         private String name;
          private String author;
           private String publisher;
            private String edition;
            
              private String added_date;
        

    
        public Users2 (String ID, String Callno, String Name, String Author, String Publisher, String Edition, String Added_date)
    {
        this.id = ID;
        this.callno = Callno;
        this.name = Name;
        this.author = Author;
        this.publisher = Publisher;
        this.edition = Edition;

        this.added_date = Added_date;
    }
    
        public String getId(){
            return id;
        }
         public String getCallno(){
            return callno;
        }
          public String getName(){
            return name;
        }
           public String getAuthor(){
            return author;
        }
            public String getEdition(){
            return edition;
        }
             
             public String getAdded_date(){
            return added_date;
        }
                public String getPublisher(){
            return publisher;
        }
    
}

    

