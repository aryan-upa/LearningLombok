package com.example.LearningLombok.Lombok.Exception;

import java.time.ZonedDateTime;

/*
    Available for complete use in Java 17.
    A record class is a shallowly immutable, transparent carrier for a fixed set of values,
    called the record components. The Java language provides concise syntax for declaring
    record classes, whereby the record components are declared in the record header.
 */
public record ApiExceptionRecord(String message,
                                 Throwable throwable,
                                 ZonedDateTime zonedDateTime) {
}
