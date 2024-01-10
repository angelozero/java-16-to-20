package com.angelozero.java20.java_02_records.dto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Records {
    public void usingRecords() {
        var newPerson = new PersonRecord("angelo 2.0");
        System.out.println("\nThis is  a new Person NAME: " + newPerson.name());

        PersonDto oldPersonDto = PersonDto.builder().name("angelo 1.0").build();
        System.out.println("\nThis is an old Person NAME: " + oldPersonDto.getName());
    }
}
