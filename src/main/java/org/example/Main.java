package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> languages1 = new ArrayList<>();
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        languages1.add("Csharp");

        Desarrollador developer1 = new Desarrollador(1, "John Doe", "Development", 5000, languages1, "Regular");
        Desarrollador developer2 = new Desarrollador(2, "John Jackson", "Development", 5000, languages1, "Bueno");

        List<Empleado> managerTeam1 = new ArrayList<>();
        managerTeam1.add(developer1);

        Gerente manager = new Gerente(3, "Jane Smith", "Management", 8000, managerTeam1, "Malo");

        // Display details and bonuses for each employee
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(developer1);
        empleados.add(developer2);
        empleados.add(manager);

        for (Empleado empleado : empleados) {
            System.out.println("Detalles del empleado:");
            empleado.mostrarDetalles();
            System.out.println("Bono: " + empleado.calcularBono() + " USD");
            System.out.println("Performance: " + ((EvaluacionDesempeno) empleado).evaluarDesempeno());
            System.out.println("-----------------------------------");
        }
    }
}