package com.cognizant.airline_ticket_reservation_system.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Component
public class UserDetailsUpdate {
    @NotBlank(message = "{error.user.name}")
    private String name;
    @NotBlank(message = "{error.user.email}")
    @Email(message = "{error.user.email.invalid}")
    private String email;
    @NotBlank(message = "{error.user.address}")
    private String address;
    @NotBlank(message = "{error.user.phone}")
    @Pattern(regexp = "^(\\d{10})?$", message = "{error.user.phone.invalid}")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDetailsUpdate{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
