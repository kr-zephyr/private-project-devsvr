package com.sz21c.common.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
    private final static ZoneId zoneId = ZoneId.of("Asia/Seoul");

    public static Long getCurrentMilliTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

        return zonedDateTime.toInstant().toEpochMilli();
    }

    public static String getDateStringFromMilliTime(Long milliTime) {
        Instant instant = Instant.ofEpochMilli(milliTime);

        return instant.atZone(zoneId).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString();
    }
}
