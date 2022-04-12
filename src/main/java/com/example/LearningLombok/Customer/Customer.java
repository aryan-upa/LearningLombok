package com.example.LearningLombok.Customer;

import java.util.Objects;


public class Customer {

    private Long id;
    private String Name;
    private String email;
    private String password;

    public Customer(String name, String email, String password) {
        this.Name = name;
        this.email = email;
        this.password = password;
    }

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getEmail(), customer.getEmail()) &&
                Objects.equals(getPassword(), customer.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getEmail(), getPassword());
    }


    public void setId(Long id) {
        this.id = id;
    }
}
