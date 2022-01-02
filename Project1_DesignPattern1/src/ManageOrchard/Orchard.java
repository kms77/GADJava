package ManageOrchard;

public interface Orchard {
    String Get_OrchardType_Information();
    void Modify_OrchardType_Information(String newTreeInformation);
    void Add_NewTrees_ToTheOrchard(int numberOfTrees);
    void Remove_Trees_FromTheOrchard(int numberOfTrees);
    Integer Get_NumberOfTrees_FromTheOrchard();
}
