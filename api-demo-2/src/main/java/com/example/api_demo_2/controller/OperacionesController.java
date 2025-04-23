package com.example.api_demo_2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1 Rest controller :Para que toda la clase se maneje mediante protocolo HTTP
@RestController

//2 RequestMapping para agregar una ruta a mi api
@RequestMapping("/api/v1")
public class OperacionesController {
    //3 Saludo
    @GetMapping("/hola")
    public String saludoFijo(){
        return "Buenos días alumnos.";
    }

    //4 metodo que retorna mi nombre
    @GetMapping("/mi-nombre")
    public String nombre(){
        return "Mi nombre es Marcelo Crisóstomo";
    }

    //5 metodo que retorna un parametro desde la url
    @GetMapping("/hello/{nombre}")
    public String saludoDinamico(@PathVariable String nombre){
        return "Hola a todos mi nombre es" + nombre;

    }

    //6-metodos con operaciones aritmeticas
    @GetMapping("/suma")
    public String suma(){
        int resultado = 5+5;
        return "El rsultado es :" + resultado;
    }

    // Resta
    @GetMapping("/resta")
    public String resta(){
        int resultado = 5-5;
        return "El rsultado es :" + resultado;
    }
    //*
    @GetMapping("/multiplicacion")
    public String multiplicacion(){
        int resultado = 5*5;
        return "El rsultado es :" + resultado;
    }

    //9 /
    @GetMapping("/division")
    public String division(){
        int resultado = 6/2;
        return "El rsultado es :" + resultado;
    }

    //10- Metodos reciben parametros por la url operaciones
    @GetMapping("/suma/{a}/{b}")
    public String sumaConParametros(@PathVariable int a, @PathVariable int b){
        return "La suma de " + a + " + " + b + "es: " +(a+b);

    }
    //11  resta
    @GetMapping("/resta/{a}/{b}")
    public String restaConParametros(@PathVariable int a, @PathVariable int b){
        return "La resta de " + a + " - " + b + "es: " +(a-b);
    }
    //12
    @GetMapping("/multiplicacion/{a}/{b}")
    public String multiplicacionConParametros(@PathVariable int a, @PathVariable int b){
        return "La multiplicacion de " + a + " * " + b + "es: " +(a*b);
    }
    //13 division
    @GetMapping("/division/{a}/{b}")
    public String divisionConParametros(@PathVariable int a, @PathVariable int b){
        if(b==0){
            return "La división por 0 no es posible";
        }
        return "La división de " + a + " / " + b + "es: " +(a/b);

    }
}
