package org.example;
import Fields.Field;
import Fields.NeutralField;
import Fields.Property;
import Fields.*;

public class Main {
    public static void main(String[] args) {
//            GUIController guiController= new GUIController();
//            guiController.GUIDice();
//            guiController.GUIController();
//
            Field[] fields = new Field[2];
            fields[0] = new NeutralField();
            fields[1] = new Property();

        for (Field f: fields
             ) {
            System.out.println(f);

        }

        FieldList fieldList = new FieldList();
        //fieldList.setupField();
        System.out.println(fieldList.getFieldIndex(2).getClass());
        System.out.println("Value of property is: "+((Property)fieldList.getFieldIndex(2)).getValue());

        }
    }
