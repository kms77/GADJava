package AbstractFactory;

import ManageDepartments.DeliveryDepartment;
import ManageDepartments.Department;
import ManageDepartments.ManagerialDepartment;
import ManageDepartments.OrchardDepartment;

public class DepartmentFactory implements AbstractFactory<Department>{
    @Override
    public Department create(String typeOfObject) {
        if("Delivery".equalsIgnoreCase(typeOfObject)){
            return new DeliveryDepartment();
        }
        else if("Managerial".equalsIgnoreCase(typeOfObject)){
            return new ManagerialDepartment();
        }
        else if("Orchard".equalsIgnoreCase(typeOfObject)){
            return new OrchardDepartment();
        }
        else
            return null;
    }
}
