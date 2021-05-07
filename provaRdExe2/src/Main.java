import model.InfoSalary;
import util.RdConstantes;

public class Main {

	public static Double salaryCalculate(InfoSalary infoSalary) {

		Double updateSalary = infoSalary.getSalary()
				+ (infoSalary.getSalary() * infoSalary.getPercent());

		if (InfoSalary.isNumeroPar(updateSalary)) {
			return updateSalary + RdConstantes.IMPAR;
		}

		return updateSalary;
	}

	public static void main(String[] args) {

		double salary = 1988.00;
		double adjustmentSalary  = 0;

		InfoSalary ds = new InfoSalary();
		ds.setSalary(salary);
		ds.setPercent(adjustmentSalary);

		System.out.println(salaryCalculate(ds));

	}

}
