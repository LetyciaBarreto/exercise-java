package exercicioSalarioEmpregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.println("Id:");
			int id = sc.nextInt();
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Salary:");
			double salary = sc.nextDouble();

			employee.add(new Employee(id, salary, name));
		}

		System.out.println("Enter the employee id that will hava salary increase:");
		int employeeId = sc.nextInt();
		Employee emp = employee.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percetage");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println("List of employees");
		for (Employee obj : employee) {
			System.out.println(obj);
		}

		sc.close();

	}

}
