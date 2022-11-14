package com;

import javax.persistence.*;


@Entity(name="Person")
public class AuditListener {
     String fname,lname;

     public String getFname() {
          return fname;
     }

     public void setFname(String fname) {
          this.fname = fname;
     }

     public String getLname() {
          return lname;
     }

     public void setLname(String lname) {
          this.lname = lname;
     }
}
