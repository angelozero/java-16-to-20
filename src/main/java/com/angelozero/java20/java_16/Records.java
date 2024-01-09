package com.angelozero.java20.java_16;

import com.angelozero.java20.java_16.dto.PersonClass;
import com.angelozero.java20.java_16.dto.PersonRecord;

public class Records {

    public void usingRecords() {

        var newPerson = new PersonRecord("angelo 2.0");
        System.out.println("\nThis is  a new Person NAME: " + newPerson.name());

        PersonClass oldPerson = PersonClass.builder().name("angelo 1.0").build();
        System.out.println("\nThis is an old Person NAME: " + oldPerson.getName());

    }
}
