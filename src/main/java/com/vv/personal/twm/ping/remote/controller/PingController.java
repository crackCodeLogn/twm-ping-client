package com.vv.personal.twm.ping.remote.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vivek
 * @since 07/12/20
 */
@RestController("PingController")
@RequestMapping("/")
public class PingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PingController.class);

    @GetMapping("ping")
    String ping() {
        String pingResult = "ALIVE-" + System.currentTimeMillis();
        LOGGER.info("PINGING back with status {}", pingResult);
        return pingResult;
    }
}
