package com.example.LearningLombok.Lombok.Exception;

import lombok.Data;

// This is a special annotation which includes several others annotations in it.
@Data
public class ApiException {
    private final String message;
    private final Throwable throwable;
}
