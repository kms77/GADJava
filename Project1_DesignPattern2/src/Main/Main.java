package Main;
import Controller.Service;
import Repository.Repository;
import View.UI;

public class Main {
    public static void main(String[] args){
        Repository repository = new Repository();
        Service service = new Service(repository);
        UI userInterface = new UI(service);
        userInterface.run();
    }
}
