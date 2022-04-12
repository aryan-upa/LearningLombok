package com.example.LearningLombok.NonLobmbok.Exception;

public class ApiException {
    private final String message;
    private final Throwable throwable;

    public ApiException(String message, Throwable throwable) {
        this.message = message;
        this.throwable = throwable;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "message='" + message + '\'' +
                ", throwable=" + throwable +
                '}';
    }


}
