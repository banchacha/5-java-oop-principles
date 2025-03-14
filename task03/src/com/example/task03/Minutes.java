package com.example.task03;

public class Minutes implements TimeUnit {

    private final long Minutes;

    public Minutes(long minutes) {
        Minutes = minutes;
    }

    @Override
    public long toMillis() {
        // TODO: реализовать
        return Minutes * 60 * 1000;
    }

    @Override
    public long toSeconds() {
        // TODO: реализовать
        return Minutes * 60;
    }

    @Override
    public long toMinutes() {
        // TODO: реализовать
        return Minutes;
    }

    @Override
    public long getHours() {
        return Math.round(Minutes / 60f);
    }
}
