package org.launchcode.techjobs.oo;

import java.util.Objects;

//Todo:1.Create a new class called JobField in the package org.launchcode.techjobs.oo.
//2.In JobField, declare each of the common fields.
//3.Code the constructors.
//4.Use Generate to create the appropriate getters and setters.
//5.Add in the custom methods-toString,hashmap
//6.Finally, to prevent the creation of a JobField object, make this class abstract.

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        this.id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public  String toString(){
        return  value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }
}


