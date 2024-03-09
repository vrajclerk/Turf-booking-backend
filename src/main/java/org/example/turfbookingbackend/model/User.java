package org.example.turfbookingbackend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    @Column(name="sex")
    private String sex;

    @Column(name="email")
    private String emailId;

    @Column(name="contact")
    private String contact;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="pincode")
    private String pincode;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private String role;

    @Column(name="wallet")
    private double walletAmount;
}
