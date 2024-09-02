/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Modelo.Persona;
import Modelo.Censo;
import Modelo.Direccion;
import Modelo.Distrito;
import Modelo.Manzana;
import Modelo.Municipio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Logica {
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static ArrayList<Municipio> municipios = new ArrayList<>();
    private static ArrayList<Censo> censos = new ArrayList<>();
    private static ArrayList<Distrito> distritos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Censo de Poblacion ---");
            System.out.println("1. Registrar nueva persona");
            System.out.println("2. Registrar un censo");
            System.out.println("3. Ver personas censadas");
            System.out.println("4. Ver municipios");
            System.out.println("5. Ver distritos y manzanas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    registrarPersona(scanner);
                    break;
                case 2:
                    registrarCenso(scanner);
                    break;
                case 3:
                    mostrarPersonas();
                    break;
                case 4:
                    mostrarMunicipios();
                    break;
                case 5:
                    mostrarDistritos();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void registrarPersona(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Fecha de nacimiento (yyyy/mm/dd): ");
        Date fechaNacimiento = new Date(scanner.nextLine());  // Puedes mejorar la entrada de la fecha
        System.out.print("Lugar de nacimiento: ");
        String lugarNacimiento = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer de entrada
        System.out.print("Sexo (M/F): ");
        String sexo = scanner.nextLine();
        System.out.print("Nivel de estudios: ");
        String nivelEstudios = scanner.nextLine();
        String situacionMilitar = null;
        if (sexo.equalsIgnoreCase("M")) {
            System.out.print("Situacion militar: ");
            situacionMilitar = scanner.nextLine();
        }
        String dni = null;
        if (edad > 16) {
            System.out.print("DNI: ");
            dni = scanner.nextLine();
        }

        Persona persona = new Persona(nombre, apellidos, fechaNacimiento, lugarNacimiento, edad, estatura, sexo, nivelEstudios, situacionMilitar, dni);
        personas.add(persona);
        System.out.println("Persona registrada exitosamente.");
    }

    private static void registrarCenso(Scanner scanner) {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas. Registre una persona primero.");
            return;
        }

        System.out.println("Seleccione una persona por número: ");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i).getNombre() + " " + personas.get(i).getApellidos());
        }
        int personaIndex = scanner.nextInt() - 1;
        Persona persona = personas.get(personaIndex);
        
        scanner.nextLine();  // Limpiar el buffer de entrada
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada
        System.out.print("Distrito: ");
        String distritoNombre = scanner.nextLine();

        // Buscar o crear distrito
        Distrito distrito = buscarDistrito(distritoNombre);
        if (distrito == null) {
            distrito = new Distrito(distritoNombre);
            distritos.add(distrito);
        }

        // Crear manzana y dirección
        Manzana manzana = new Manzana("MZ-" + (distrito.getManzanas().size() + 1));
        Direccion direccion = new Direccion(calle, numero, manzana);
        manzana.agregarDireccion(direccion);
        distrito.agregarManzana(manzana);

        // Registrar censo
        Censo censo = new Censo(persona, direccion, new Date());
        censos.add(censo);
        System.out.println("Censo registrado exitosamente.");
    }

    private static void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("\n--- Lista de Personas Registradas ---");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellidos());
        }
    }

    private static void mostrarMunicipios() {
        if (municipios.isEmpty()) {
            System.out.println("No hay municipios registrados.");
            return;
        }

        System.out.println("\n--- Lista de Municipios ---");
        for (Municipio municipio : municipios) {
            System.out.println(municipio.getNombre() + " (Código: " + municipio.getCodigo() + ")");
        }
    }

    private static void mostrarDistritos() {
        if (distritos.isEmpty()) {
            System.out.println("No hay distritos registrados.");
            return;
        }

        System.out.println("\n--- Lista de Distritos ---");
        for (Distrito distrito : distritos) {
            System.out.println("Distrito: " + distrito.getNombre());
            distrito.mostrarManzanas();
        }
    }

    private static Distrito buscarDistrito(String nombre) {
        for (Distrito distrito : distritos) {
            if (distrito.getNombre().equalsIgnoreCase(nombre)) {
                return distrito;
            }
        }
        return null;
    }
}

