package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void findCrashNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(11);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNegativeNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-5);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findVolumeIncreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void findVolumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void findVolumeDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findVolumeDecreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberBorderMinimal() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        int actual = radio.getCurrentNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberBorderExactly() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        int actual = radio.getCurrentNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberNextMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberNextExactly() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findCrashNumberNext() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findNumberPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findNumberPrevZero() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findNumberIncreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.increaseNumber();
        int actual = radio.getCurrentNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findNumberIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        radio.increaseNumber();
        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }


}