import AbstractFactory.*;
import ManageOrchard.Orchard;

public class FactoryProvider {
    public static AbstractFactory getFactory(String typeOfFactory){
        if("Orchard".equalsIgnoreCase(typeOfFactory)){
            return new OrchardFactory();
        }
        else if("Department".equalsIgnoreCase(typeOfFactory)){
            return new DepartmentFactory();
        }
        else
            return null;
    }
}
