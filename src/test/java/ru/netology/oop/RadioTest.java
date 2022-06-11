package ru.netology.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setMoreMaxVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setLessMinVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-11);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void increaseVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.increaseVolume();
        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void decreaseLessMinVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void increaseMoreMaxVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}