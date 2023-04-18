package org.wits.coindesk.utils;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public final class TimeUtils {

    public static OffsetDateTime getCurrentUTCDateTime() {
        return OffsetDateTime.now(ZoneOffset.UTC);
    }

    public static Long toUTCMilliseconds(OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return null;
        } else {
            return offsetDateTime.toInstant().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
        }
    }

}
