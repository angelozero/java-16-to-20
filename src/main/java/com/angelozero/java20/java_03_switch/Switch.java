package com.angelozero.java20.java_03_switch;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Switch {

    public void oldSwitch(String color) {
        switch (color) {
            case "RED":
                System.out.println("The color is RED");
            case "BLUE":
                System.out.println("The color is BLUE");
            case "GREEN":
                System.out.println("The color is GREEN");
            default:
                System.out.println("I don't know what color is!");
        }
    }

    public void newSwitch(String color) {
        var message = switch (color) {
            case "RED" -> "The color is RED";
            case "BLUE" -> "The color is BLUE";
            case "GREEN" -> "The color is GREEN";
            default -> "I don't know what color is!";
        };
        System.out.println(message);
    }
}
