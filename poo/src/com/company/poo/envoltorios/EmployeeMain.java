package com.company.poo.envoltorios;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Juanito Garcia", 30, 40000D, false);
        Employee employee2 = new Employee("Roberto Loquesea", 35, 40000D, true);

        System.out.println(employee2.age); // tiene valor asociado 35

        Employee employee3 = new Employee();
        System.out.println(employee3.age); // null

        Employee employee4 = new Employee(null, null, null, null);
        employee4.age = 18;
    }
}
