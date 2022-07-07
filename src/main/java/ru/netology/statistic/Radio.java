package ru.netology.statistic;

public class Radio {

    private int currentNumber; //Номер текущей радиостанции
    private int currentVolume; //Громкость звука
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }
    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;


    }

    public int getCurrentNumber() {

        return currentNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber + 1;
        }
        return;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return;
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentNumber < maxStation) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = 9;
        }
    }


    public void setCurrentNumber(int currentNumber) {

        if (currentNumber > maxStation) {
            return;
        }
        if (currentNumber < 0) {
            return;

        }
        this.currentNumber = currentNumber;
    }


    public void setCurrentVolume(int CurrentVolume) {

        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

}



