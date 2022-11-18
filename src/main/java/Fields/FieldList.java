package Fields;

import java.awt.*;

public class FieldList {

    private Field[] fieldList;

    // constructor der indeholder array
    public FieldList() {
        InitializeFieldList();
    }

    public void InitializeFieldList() {
        this.fieldList = new Field[24];
    }

    public void setupField(){
        fieldList[0] = new StartField();
        ((StartField)fieldList[0]).setName("START");
        ((StartField)fieldList[0]).setColor(Color.LIGHT_GRAY);

        fieldList[1] = new Property();
        ((Property)fieldList[1]).setName("BURGERBAREN");
        ((Property)fieldList[1]).setValue(1);
        ((Property)fieldList[1]).setColor(Color.ORANGE);

        fieldList[2] = new Property();
        ((Property)fieldList[2]).setName("PIZZAHUSET");
        ((Property)fieldList[2]).setValue(1);
        ((Property)fieldList[2]).setColor(Color.ORANGE);

        fieldList[3] = new Chance();
        ((Chance)fieldList[3]).setName("Chance");
    }

    public Field getFieldIndex(int index){
        return fieldList[index];

    }
}
