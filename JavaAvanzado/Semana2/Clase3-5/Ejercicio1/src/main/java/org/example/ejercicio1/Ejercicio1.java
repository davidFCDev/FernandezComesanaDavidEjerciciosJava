package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.example.ejercicio1.models.Employee;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creación de empleados
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("David", 40000, "Desarrollador"));
        employeeList.add(new Employee("Sofía", 38000, "Analista"));
        employeeList.add(new Employee("Paco", 45000, "Gerente"));
        employeeList.add(new Employee("María", 32000, "Desarrollador"));
        employeeList.add(new Employee("Pedro", 30000, "Analista"));

        // Filtro de empleados por salario
        double minSalary = 39000;

        List<Employee> filteredList = employeeList.stream()
                .filter(e -> e.getSalary() > minSalary)
                .collect(Collectors.toList());

        System.out.println("Empleados filtrados por salario superior a " + minSalary + " :");
        filteredList.forEach(System.out::println);

        // Agrupar empleados por categoria y calcular salario promedio
        Map<String, Double> salarioPromedioPorCategoria = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("------------------------------------------------");
        System.out.println("Salario promedio por categoría:");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio)
                -> System.out.println("Categoría: " + categoria + ", Salario Promedio: " + salarioPromedio));

        // Empleado con el salario más alto usando Optionals
        Optional<Employee> empleadoConSalarioMasAlto = employeeList.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        System.out.println("------------------------------------------------");
        empleadoConSalarioMasAlto.ifPresent(empleado -> System.out.println(
                "Empleado con el salario más alto: " + empleado.getName()+
                ", Salario: " + empleado.getSalary()));
        
    }
}
