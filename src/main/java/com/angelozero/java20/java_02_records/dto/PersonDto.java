package com.angelozero.java20.java_02_records.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDto {
    private final String name;
}
