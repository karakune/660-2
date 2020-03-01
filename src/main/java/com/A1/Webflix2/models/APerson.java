package com.A1.Webflix2.models;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
// import javax.persistence.Table;
import java.sql.Date;
 
public abstract class APerson {
    public int id;

    public String firstName;

    public String lastName;

    public Date birthDate;

    public String birthplace;

    public String photo;

    public String bio;

    public String role;
    
}