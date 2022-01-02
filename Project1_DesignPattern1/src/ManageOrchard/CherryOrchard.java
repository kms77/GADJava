package ManageOrchard;

public class CherryOrchard implements Orchard {

    String cherryTreeInformation;
    int numberOfCherryTrees;

    public CherryOrchard() {
        this.cherryTreeInformation = "Sweet cherry trees are large and " +
                "rather upright, attaining heights up to 11 metres (36 feet). " +
                "The fruit is a fleshy drupe (stone fruit) that is generally " +
                "heart-shaped to nearly globular, about 2 cm (1 inch) in diameter, " +
                "and varies in colour from yellow through red to nearly black.";
        this.numberOfCherryTrees = 0;
    }

    @Override
    public String Get_OrchardType_Information() {
        return this.cherryTreeInformation;
    }

    @Override
    public void Modify_OrchardType_Information(String newTreeInformation) {
        this.cherryTreeInformation = newTreeInformation;
    }

    @Override
    public void Add_NewTrees_ToTheOrchard(int numberOfTrees) {
        this.numberOfCherryTrees += numberOfTrees;
    }

    @Override
    public void Remove_Trees_FromTheOrchard(int numberOfTrees) {
        this.numberOfCherryTrees -= numberOfTrees;
    }

    @Override
    public Integer Get_NumberOfTrees_FromTheOrchard() {
        return numberOfCherryTrees;
    }
}
