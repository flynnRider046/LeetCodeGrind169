package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamImplementation {
    //https://medium.com/@JavaFusion/intermediate-terminal-operations-in-java-8-8fd61c7e0c93
    public static void main(String[] args) {
        List<Employee> emList = Arrays.asList(
                new Employee("Rohith","IT",5000),
                new Employee("Ramesh","IT",6000),
                new Employee("Siddarth","HR",3000),
                new Employee("Akhila","HR",6000)
        );
        //Filter the employees that start with R
        List<Employee> sameName = emList.stream().filter(emp -> emp.name().startsWith("R")).toList();
        System.out.println(sameName);
        //Map words to uppercase
        List<String> uName = emList.stream().map(emp -> emp.name().toUpperCase()).toList();
        System.out.println(uName);
        //sorting employee by their name ascending & descending
        List<Employee> ascendingEmpName = emList.stream()
                .sorted(Comparator.comparing(emp -> emp.name()))
                .toList();
        System.out.println(ascendingEmpName);
        List<Employee> descendingEmpName = emList.stream()
                .sorted(Comparator.comparing(Employee::name).reversed()).toList();
        System.out.println(descendingEmpName);
        //sorting employee by their salary ascending & descending
        List<Employee> ascendingSalary = emList.stream()
                .sorted(Comparator.comparing(emp -> emp.salary()))
                .toList();
        System.out.println(ascendingSalary);
        List<String> descendingSalary = emList.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .map(emp ->emp.name())
                .toList();
        System.out.println(descendingSalary);
    }
}
