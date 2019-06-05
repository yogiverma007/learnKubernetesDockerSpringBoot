package com.freedom.learnKDSB.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthResponse {

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthResponse.class);

    private String program;

    private String version;

    private String release;

    private String deployTag;

    private String datetime = LocalDateTime.now().toString();

    private String status = "success";


    private String message = "OK";

    private String ip;

    private String hostname;

    private Long nodeIdentifier;

    private List<DependenciesHealthStatus> dependentservices = null;

    private HealthData data = new HealthData();

    public HealthResponse() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            this.ip = inetAddress.getHostAddress();
            this.hostname = inetAddress.getHostName();
        } catch (UnknownHostException uhe) {
            LOGGER.error(uhe.getLocalizedMessage(), uhe);
        }
    }

    @Data
    public static class HealthData {

        private float duration = 0;

        private String message = "Service is healthy";

    }

    @Data
    public static class DependenciesHealthStatus {

        private String serviceName = null;

        private String status = "";

        private int code = 0;

        private float duration = 0;

        private String message = "Service is Healthy";

    }

}
