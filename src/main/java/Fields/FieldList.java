package Fields;

public class FieldList {

    private Field[] fieldList;

    // constructor der indeholdder array
    public FieldList() {
        InitializeFieldList();
    }

    public void InitializeFieldList() {
        this.fieldList = new Field[24];
    }
    public void setupField(){
        fieldList[0] = new StartField();
        fieldList[1] = new Property();
        fieldList[1].setName();
        fieldList[1].Property().setValue();
        fieldList[1].setAvailability();
        fieldList[1].setType();
    }
}
