package org.example;

import java.util.List;

class Gerente extends Empleado implements EvaluacionDesempeno {
    List<Empleado> team;
    String desempeno;

    public Gerente(int id, String name, String department, double salary, List<Empleado> team,String desempeno) {
        super(id, name, department, salary);
        this.team = team;
        this.desempeno = desempeno;
    }
    @Override
    double calcularBono() {
        double posibleBono = team.size() * 500;
        if (desempeno == "Regular"){
            return posibleBono/2;
        } else if(desempeno == "Bueno"){
            return posibleBono;
        }
        return 0;
    }
    @Override
    public String evaluarDesempeno() {
        return this.desempeno;
    }
    @Override
    void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Team Size: " + team.size());
    }
}