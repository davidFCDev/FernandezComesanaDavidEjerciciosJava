
package org.example.ejercicio1.models;

public class Employee {
    private String name;
    private double salary;
    private String category;

    public Employee() {
    }

    public Employee(String name, double salary, String category) {
        this.name = name;
        this.salary = salary;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", category=" + category + '}';
    }
    
    
}
