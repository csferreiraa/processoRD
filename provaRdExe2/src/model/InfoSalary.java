package model;

public class InfoSalary {

    private Double salary;
    private Double percent;

 
    

    public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public static InfoSalary create(Double salary, Double percent) {
        InfoSalary infosalary = new InfoSalary();

        infosalary.salary = salary;
        infosalary.percent = percent;
        return infosalary;
    }
    
	public static boolean isNumeroPar(Double salario) {
		return (salario % 2 == 0);
	}
}
