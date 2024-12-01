package org.example.resourceserver.lesson;

import java.time.LocalDateTime;

public class Lesson {
    private String title;
    private String description;
    private String tutor;

    private LocalDateTime schedule;

    public Lesson(String title, String description, String tutor, LocalDateTime schedule) {
        this.title = title;
        this.description = description;
        this.tutor = tutor;
        this.schedule = schedule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

}
