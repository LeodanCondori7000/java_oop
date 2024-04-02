package org.example;

import java.util.List;

class Desarrollador extends Empleado implements EvaluacionDesempeno {
    List<String> languages;
    String desempeno;

    public Desarrollador(int id, String name, String department, double salary, List<String> languages,String desempeno) {
        super(id, name, department, salary);
        this.languages = languages;
        this.desempeno = desempeno;
    }

    @Override
    double calcularBono() {
        double posibleBono = languages.size() * 100;
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
        System.out.println("Languages: " + String.join(", ", languages));
    }
}
