package com.vv.personal.twm.ping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.TimeZone;

/**
 * @author Vivek
 * @since 2024-08-11
 */
@SpringBootApplication
public class PingClient {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("EST", ZoneId.SHORT_IDS))); //force setting
        SpringApplication.run(PingClient.class, args);
    }
}
