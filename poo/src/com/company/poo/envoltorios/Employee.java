package com.company.poo.envoltorios;

public class Employee {

    // 1. atributos
    public String fullName;
    public Integer age;
    public Double salary; // null
    public Boolean married;

    // 2. constructores
    public Employee(){}

    public Employee(String fullName, Integer age, Double salary, Boolean married) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }

    // 3. metodos

    // 4. metodos getter y setter / toString / ...


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
