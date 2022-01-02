package ManageDepartments;

public interface Department {
    String Get_DepartmentName_String();
    void Add_NewEmployees_ToTheDepartment(int numberOfEmployees);
    void Remove_Employees_FromTheDepartment(int numberOfEmployees);
    Integer Get_NumberOfEmployees_FromDepartment();
}
