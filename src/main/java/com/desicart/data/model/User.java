package com.desicart.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    @Id
    @Field("_id")
    private String id;
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
    @Field("user_name")
    private String userName;
    @Field("pw")
    private String passWord;
    @Field("email_addrs")
    private String email;
    @Field("phone_number")
    private String phoneNumber;
    @Field("user_type")
    private String type;
    @Field("address")
    private String address;
    @Field("payment_method")
    private String payment;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public User(String id, String firstName, String lastName, String userName, String passWord, String email, String phoneNumber, String type, String address, String payment) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.userName = userName;
//        this.passWord = passWord;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.type = type;
//        this.address = address;
//        this.payment = payment;
//    }
}
