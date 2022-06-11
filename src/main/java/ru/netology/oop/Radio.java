package ru.netology.oop;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentVolume(int currentVolume){
        if (currentVolume < 0){
            return;
        }
        if (currentVolume > 10){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
