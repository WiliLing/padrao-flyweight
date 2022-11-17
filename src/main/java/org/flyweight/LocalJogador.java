package org.flyweight;

public class LocalJogador {
    private String latitude;
    private String longitue;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitue() {
        return longitue;
    }

    public void setLongitue(String longitue) {
        this.longitue = longitue;
    }

    public LocalJogador(String xLocation, String yLocation) {
        this.latitude = xLocation;
        this.longitue = yLocation;
    }


        }
