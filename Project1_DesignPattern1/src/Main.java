import AbstractFactory.*;
import ManageDepartments.Department;
import ManageOrchard.AppleOrchard;
import ManageOrchard.Orchard;

public class Main{
    public static void main (String[] args){
        AbstractFactory<Orchard> orchardFactory  = FactoryProvider.getFactory("Orchard");
        Orchard appleOrchard = orchardFactory.create("Apple");
        System.out.println("Apple orchard number: " + appleOrchard.Get_NumberOfTrees_FromTheOrchard());
        System.out.println("Apple orchard information: " + appleOrchard.Get_OrchardType_Information());
        appleOrchard.Add_NewTrees_ToTheOrchard(30);
        appleOrchard.Remove_Trees_FromTheOrchard(5);
        appleOrchard.Modify_OrchardType_Information("New information about the apple orchard");
        System.out.println("Apple orchard - number of trees: " + appleOrchard.Get_NumberOfTrees_FromTheOrchard());
        System.out.println("Apple orchard information: " + appleOrchard.Get_OrchardType_Information());
        Orchard cherryOrchard = orchardFactory.create("Cherry");
        System.out.println("Cherry orchard information: " + cherryOrchard.Get_OrchardType_Information());
        AbstractFactory<Department> departmentFactory = FactoryProvider.getFactory("Department");
        Department deliveryDepartment = departmentFactory.create("Delivery");
        System.out.println("Delivery department name: " + deliveryDepartment.Get_DepartmentName_String());
        deliveryDepartment.Add_NewEmployees_ToTheDepartment(10);
        deliveryDepartment.Remove_Employees_FromTheDepartment(2);
        System.out.println("Delivery department - number of employees: " + deliveryDepartment.Get_NumberOfEmployees_FromDepartment());
        Department managerialDepartment = departmentFactory.create("Managerial");
        System.out.println("Managerial department name: " + managerialDepartment.Get_DepartmentName_String());
    }
}
