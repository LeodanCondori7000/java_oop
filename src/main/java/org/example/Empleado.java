package org.example;

abstract public class Empleado {
    int id;
    String name;
    String department;
    double salary;

    public Empleado(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    abstract double calcularBono();
    void mostrarDetalles() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

}
