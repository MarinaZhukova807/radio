package ru.netology.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio(); //количество станций по умолчанию, все объекты со значениями по умолчанию
    Radio radioClever = new Radio(30); //количество станций задается
    @Test
    void setVolumeTest() {

        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationTest() {
        radioClever.setCurrentRadioStation(20);
        int expected = 20;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    void setMoreMaxRadioStationTest() {
        radioClever.setCurrentRadioStation(100);
        int expected = 0;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setLessMinRadioStationTest() {
        radioClever.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextMoreMaxRadioStationTest() {
        radioClever.setCurrentRadioStation(29);
        radioClever.nextRadioStation();
        int expected = 0;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevLessMinRadioStationTest() {
        radioClever.setCurrentRadioStation(0);
        radioClever.prevRadioStation();
        int expected = 29;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationTest() {
        radioClever.setCurrentRadioStation(5);
        radioClever.nextRadioStation();
        int expected = 6;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationTest() {
        radioClever.setCurrentRadioStation(6);
        radioClever.prevRadioStation();
        int expected = 5;
        int actual = radioClever.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setMoreMaxVolumeTest() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setLessMinVolumeTest() {
        radio.setCurrentVolume(-11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeTest() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeTest() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseLessMinVolumeTest() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseMoreMaxVolumeTest() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}