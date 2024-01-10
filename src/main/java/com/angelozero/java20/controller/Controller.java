package com.angelozero.java20.controller;

import com.angelozero.java20.java_01_instanceof.InstanceOf;
import com.angelozero.java20.java_02_records.dto.Records;
import com.angelozero.java20.java_03_switch.Switch;
import com.angelozero.java20.java_04_virtual_thread.VirtualThread;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;

@RestController
@AllArgsConstructor
public class Controller {

    private final InstanceOf instanceOf;
    private final Records records;
    private final Switch _switch;
    private final VirtualThread virtualThread;

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping(value = "/instance-of", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> instanceOf() {
        instanceOf.newInstanceOf("test");
        return new ResponseEntity<>("instance of executed", HttpStatus.OK);
    }

    @GetMapping(value = "/records", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> records() {
        records.usingRecords();
        return new ResponseEntity<>("records executed", HttpStatus.OK);
    }

    @GetMapping(value = "/switch", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testSwitch() {
        _switch.newSwitch("BLUE");
        return new ResponseEntity<>("switch executed", HttpStatus.OK);
    }

    @GetMapping(value = "/virtual-thread", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> virtualThread() throws InterruptedException {
        Instant start = Instant.now();
        virtualThread.execute(1000, Executors.newVirtualThreadPerTaskExecutor());
        Instant end = Instant.now();
        System.out.printf("\n Finished with %d", ChronoUnit.SECONDS.between(start, end));
        return new ResponseEntity<>("virtual thread executed", HttpStatus.OK);
    }

}
