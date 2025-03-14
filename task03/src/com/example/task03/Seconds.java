package com.example.task03;

/**
 * Интервал в секундах
 */
public class Seconds implements TimeUnit {

    private final long Seconds;

    public Seconds(long seconds) {
        Seconds = seconds;
    }

    @Override
    public long toMillis() {
        return Seconds * 1000;
    }

    @Override
    public long toSeconds() {
        return Seconds;
    }

    @Override
    public long toMinutes() {
        return Math.round(Seconds / 60f);
    }

    public long getHours() {
        return Math.round(Seconds / 3600f);
    }
}
