package ManageDepartments;

public class DeliveryDepartment implements Department{

    int numberOfEmployees;
    String departmentName;

    public DeliveryDepartment() {
        this.numberOfEmployees = 0;
        this.departmentName = "Delivery Department";
    }

    @Override
    public String Get_DepartmentName_String() {
        return this.departmentName;
    }

    @Override
    public void Add_NewEmployees_ToTheDepartment(int numberOfEmployees) {
        this.numberOfEmployees += numberOfEmployees;
    }

    @Override
    public void Remove_Employees_FromTheDepartment(int numberOfEmployees) {
        this.numberOfEmployees -= numberOfEmployees;
    }

    @Override
    public Integer Get_NumberOfEmployees_FromDepartment() {
        return numberOfEmployees;
    }
}
