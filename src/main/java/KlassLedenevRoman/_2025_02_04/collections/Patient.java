package org.example._2025_02_04.collections;

import java.time.LocalDateTime;
import java.util.Objects;

public class Patient implements Comparable {
    private LocalDateTime time;

    public Patient(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(time, patient.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "time=" + time +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        return this.time.compareTo(patient.time);
    }
}
