package ru.netology.oop;

public class Radio {
    private int radioStationCount = 10;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {

    }

    public Radio(int radioStationCount) {
        this.radioStationCount = radioStationCount;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > radioStationCount - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < radioStationCount - 1) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        currentRadioStation = 0;
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
            return;
        }
        currentRadioStation = radioStationCount - 1;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
