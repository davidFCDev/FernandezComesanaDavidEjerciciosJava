
package org.example.ejercicio2.models;

import java.time.LocalDate;

public class Event {
    private String name;
    private LocalDate date;
    private String category;

    public Event() {
    }

    public Event(String name, LocalDate date, String category) {
        this.name = name;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Events{" + "name=" + name + ", date=" + date + ", category=" + category + '}';
    }
    
    
}
