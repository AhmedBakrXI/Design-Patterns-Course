public class RegularEmployee extends Employee {
    @Override
    public Employee ShallowCopy() {
        return this;
    }

    @Override
    public Employee DeepCopy() {
        Employee employee = new TempEmployee();
        employee.setId(this.getId());
        employee.setName(this.getName());
        employee.setAddress(this.getAddress());

        return employee;
    }
}
