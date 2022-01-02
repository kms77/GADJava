package ManageOrchard;

public class PearOrchard implements Orchard {

    String pearTreeInformation;
    int numberOfPearTrees;

    public PearOrchard() {
        this.pearTreeInformation = "In most cases, pear tree " +
                "is a deciduous tree (it loses its leaves seasonally) " +
                "that can grow up to 40 feet (12 meters) tall or even more. " +
                "Pear tree is a member of Rose family.";
        this.numberOfPearTrees = 0;
    }

    @Override
    public String Get_OrchardType_Information() {
        return pearTreeInformation;
    }

    @Override
    public void Modify_OrchardType_Information(String newTreeInformation) {
        this.pearTreeInformation = newTreeInformation;
    }

    @Override
    public void Add_NewTrees_ToTheOrchard(int numberOfTrees) {
        this.numberOfPearTrees += numberOfTrees;
    }

    @Override
    public void Remove_Trees_FromTheOrchard(int numberOfTrees) {
        this.numberOfPearTrees -= numberOfTrees;
    }

    @Override
    public Integer Get_NumberOfTrees_FromTheOrchard() {
        return numberOfPearTrees;
    }
}
