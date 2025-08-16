package com.user.lost_found.model;

import jakarta.persistence.*;

@Entity // marks java class as database entity
@Table
public class LostItem {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment value of id
    private Long id;

    private String itemName;
    private String description;
    private String contactInfo;

    public LostItem(){}
    public LostItem(String itemName, String description, String contactInfo) {
        this.itemName = itemName;
        this.description = description;
        this.contactInfo = contactInfo;
    }



    public Long getId() {return id;}
    public String getItemName() {return itemName;}
    public void setItemName(String itemName) {this.itemName = itemName;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getContactInfo() {return contactInfo;}
    public void setContactInfo(String contactInfo) {this.contactInfo = contactInfo;}
     //default constructor for database
    }

