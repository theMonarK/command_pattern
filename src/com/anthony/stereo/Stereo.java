package com.anthony.stereo;

public class Stereo {

    Cd cd;
    Dvd dvd;
    float radioStation;
    int volume;
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println("Stereo On!");
    }

    public void off(){
        System.out.println("Stereo off!");
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
        System.out.println(String.format("CD sets to %s: %s",cd.getArtist(),cd.getAlbum()));
    }

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
        System.out.println(String.format("DVD sets to %s: %s",dvd.getFilmName(),dvd.getProducer()));
    }

    public float getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(float radioStation) {
        this.radioStation = radioStation;
        System.out.println(String.format("Radio sets to: %s",this.radioStation));
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(String.format("Volume sets to %s",this.volume));
    }
}
