package AbstractFactory;

import ManageDepartments.Department;
import ManageOrchard.Orchard;

public interface AbstractFactory<T>{
    T create(String typeOfObject);
}
