package com.javatest;

import java.util.Objects;

public class Customer {

    private String firstName = null;
    private String lastName = null;
    private String dniNumber = null;

    public Customer(String firstName, String lastName, String dniNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dniNumber = dniNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String getDniNumber() {
        return this.dniNumber;
    }

    // Método toString
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dniNumber='" + dniNumber + '\'' +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName) &&
                dniNumber.equals(customer.dniNumber);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dniNumber);
    }
}