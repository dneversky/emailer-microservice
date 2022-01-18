package org.dneversky.emailer.model;

public record EmailNotification(String mailTo, String subject, String message) {
    public EmailNotification {}
}