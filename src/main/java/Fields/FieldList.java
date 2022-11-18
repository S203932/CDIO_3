package Fields;

import java.awt.*;
import java.util.ArrayList;

import CreateAndWriteToAndFromTXT.*;
public class FieldList {

    private Field[] fieldList;

    // constructor der indeholder array
    public FieldList() {
        InitializeFieldList();
    }

    public void InitializeFieldList() {
        this.fieldList = new Field[24];
    }

    public void setupField(String filename){
        ReadFile readFile = new ReadFile();
        ArrayList<String> stringArrayList = readFile.ReadFile(filename);
        fieldList[0] = new StartField();
        ((StartField)fieldList[0]).setName(stringArrayList.get(0));
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
        ((Chance)fieldList[3]).setName("CHANCE");
        ((Chance)fieldList[3]).setColor(Color.LIGHT_GRAY);

        fieldList[4] = new Property();
        ((Property)fieldList[4]).setName("SLIKBUTIKKEN");
        ((Property)fieldList[4]).setValue(1);
        ((Property)fieldList[4]).setColor(Color.GRAY);

        fieldList[5] = new Property();
        ((Property)fieldList[5]).setName("ISKIOSKEN");
        ((Property)fieldList[5]).setValue(1);
        ((Property)fieldList[5]).setColor(Color.GRAY);

        fieldList[6] = new NeutralField();
        ((NeutralField)fieldList[6]).setName("BESØG I FAENGSEL");
        ((NeutralField)fieldList[6]).setColor(Color.CYAN);
        ((Chance)fieldList[3]).setName("Chance");
    }
    public Field getFieldIndex(int index){
        return fieldList[index];
    }
}
