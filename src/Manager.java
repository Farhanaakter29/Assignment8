public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        setName(name);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}

