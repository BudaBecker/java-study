package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary*percentage/100;
    }
    public String toString(){
        return this.name
            + ", $"
            + String.format("%.2f\n", this.netSalary());
    }
}
