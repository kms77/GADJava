package AbstractFactory;

import ManageOrchard.AppleOrchard;
import ManageOrchard.CherryOrchard;
import ManageOrchard.Orchard;
import ManageOrchard.PearOrchard;

public class OrchardFactory implements AbstractFactory<Orchard>{

    @Override
    public Orchard create(String typeOfObject) {
        if("Apple".equalsIgnoreCase(typeOfObject)){
            return new AppleOrchard();
        }
        else if("Cherry".equalsIgnoreCase(typeOfObject)){
            return new CherryOrchard();
        }
        else if("Pear".equalsIgnoreCase(typeOfObject)){
            return new PearOrchard();
        }
        else
            return null;
    }
}
