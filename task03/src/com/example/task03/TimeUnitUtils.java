package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     *
     * @param seconds интервал в секундах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Seconds seconds) {
        return new Milliseconds(seconds.toMillis());
    }

    public static Milliseconds toMillis(Minutes minutes) {
        return new Milliseconds(minutes.toMillis());
    }

    public static Milliseconds toMillis(Hours hours) {
        return new Milliseconds(hours.toMillis());
    }
    public static Seconds toSeconds(Milliseconds millis) {
        return new Seconds(millis.toSeconds());
    }

    public static Seconds toSeconds(Minutes minutes) {
        return new Seconds(minutes.toSeconds());
    }

    public static Seconds toSeconds(Hours hours) {
        return new Seconds(hours.toSeconds());
    }

    public static Minutes toMinutes(Milliseconds milliseconds) {
        return new Minutes(milliseconds.toMinutes());
    }

    public static Minutes toMinutes(Seconds seconds) {
        return new Minutes(seconds.toMinutes());
    }

    public static Minutes toMinutes(Hours hours) {
        return new Minutes(hours.toMinutes());
    }

    public static Hours toHours(Milliseconds milliseconds) {
        return new Hours(milliseconds.getHours());
    }

    public static Hours toHours(Seconds seconds) {
        return new Hours(seconds.getHours());
    }

    public static Hours toHours(Minutes minutes) {
        return new Hours(minutes.getHours());
    }
}
