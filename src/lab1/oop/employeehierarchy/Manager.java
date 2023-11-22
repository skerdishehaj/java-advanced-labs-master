package lab1.oop.employeehierarchy;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(Employee employee, int teamSize) {
        super(employee.getName(), employee.getSalary());
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void setSalary (double salary) {
        super.setSalary(salary * 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }
}
