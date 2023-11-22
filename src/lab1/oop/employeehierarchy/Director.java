package lab1.oop.employeehierarchy;

public class Director extends Manager{
private double departmentBudget;

    public Director(Manager manager, double departmentBudget) {
        super(new Employee(manager.getName(), manager.getSalary()),manager.getTeamSize());
        this.departmentBudget = departmentBudget;
    }

    public double getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentBudget(double departmentBudget) {
        this.departmentBudget = departmentBudget;
    }
    @Override
    public void setSalary (double salary) {
        super.setSalary(salary * 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Director{" +
                "departmentBudget=" + departmentBudget +
                '}';
    }
}
