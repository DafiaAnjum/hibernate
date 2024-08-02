package com.project.hibernate2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class first {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name="name")
    private String Name;
    
    @Column(name="email")
    private String Email;
    
    @Column(name="password")
    private String Password;
    
    @Column(name="phoneno")
    private String Phoneno;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(String phoneno) {
        Phoneno = phoneno;
    }

    // Constructors

    public first(int id, String name, String email, String password, String phoneno) {
        super();
        this.id = id;
        Name = name;
        Email = email;
        Password = password;
        Phoneno = phoneno;
    }

    public first() {
        super();
    }
}
