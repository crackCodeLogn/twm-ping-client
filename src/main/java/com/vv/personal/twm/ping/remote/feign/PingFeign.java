package com.vv.personal.twm.ping.remote.feign;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vivek
 * @since 07/12/20
 */
public interface PingFeign {
    @GetMapping("/ping")
    String ping();
}