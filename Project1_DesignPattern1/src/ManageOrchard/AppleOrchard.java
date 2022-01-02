package ManageOrchard;

public class AppleOrchard implements Orchard {

    String appleTreeInformation;
    int numberOfAppleTrees;

    public AppleOrchard(){
        this.appleTreeInformation = "Its wide spread is caused partly because " +
                "apple tree is very flexible and resilient. It can give fruits even " +
                "in temperatures below -22 °F (-30 °C). Nowadays, apple trees are " +
                "cultivated in diverse climate conditions, ranging from the cold of " +
                "Canada to the tropical climate of Africa.";
        this.numberOfAppleTrees = 0;
    }
    @Override
    public String Get_OrchardType_Information() {
        return appleTreeInformation;
    }

    @Override
    public void Modify_OrchardType_Information(String newTreeInformation) {
        this.appleTreeInformation = newTreeInformation;
    }

    @Override
    public void Add_NewTrees_ToTheOrchard(int numberOfTrees) {
        this.numberOfAppleTrees += numberOfTrees;
    }

    @Override
    public void Remove_Trees_FromTheOrchard(int numberOfTrees) {
        this.numberOfAppleTrees -= numberOfTrees;
    }

    @Override
    public Integer Get_NumberOfTrees_FromTheOrchard() {
        return numberOfAppleTrees;
    }
}
