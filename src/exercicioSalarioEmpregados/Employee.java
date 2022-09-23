package exercicioSalarioEmpregados;

public class Employee {

	protected Integer id;
	protected Double salary;
	protected String name;

	public Employee(Integer id, Double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void increaseSalary(double percentage) {
		this.salary += this.salary * (percentage/100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}
