package ru.alishev.springcourse.project3.util;

/**
 * @author Neil Alishev
 */
public class MeasurementErrorResponse {
    private String message;
    private long timestamp;

    public MeasurementErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
