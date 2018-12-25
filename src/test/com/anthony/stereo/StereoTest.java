package test.com.anthony.stereo;

import com.anthony.stereo.Cd;
import com.anthony.stereo.Dvd;
import com.anthony.stereo.Stereo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StereoTest {

    Stereo stereo = new Stereo("bedroom");
    Cd cdMetallica = new Cd("Metallica","Black Album");

    @BeforeEach
    void setUp() {
        Cd cd = new Cd("Guns n' Roses","Appetite For Destruction");
        Dvd dvd = new Dvd("Star Wars","George Lucas");
        this.stereo.setCd(cd);
        this.stereo.setDvd(dvd);
        this.stereo.setVolume(15);
        this.stereo.setRadioStation(85.2f);
    }

    @Test
    void on() {
        assertEquals("bedroom stereo on!",this.stereo.on());
    }

    @Test
    void off() {
        assertEquals("bedroom stereo off!",this.stereo.off());
    }

    @Test
    void getCd() {
        assertEquals("Guns n' Roses",this.stereo.getCd().getArtist());
        assertEquals("Appetite For Destruction", this.stereo.getCd().getAlbum());
    }

    @Test
    void setCd() {
        this.stereo.setCd(this.cdMetallica);
        assertEquals("Metallica",this.stereo.getCd().getArtist());
        assertEquals("Black Album", this.stereo.getCd().getAlbum());
    }

    @Test
    void getDvd() {
        assertEquals("Star Wars",this.stereo.getDvd().getFilmName());
        assertEquals("George Lucas", this.stereo.getDvd().getProducer());
    }

    @Test
    void setDvd() {
    }

    @Test
    void getRadioStation() {
        assertEquals(85.2f,this.stereo.getRadioStation());
    }

    @Test
    void setRadioStation() {
    }

    @Test
    void getVolume() {
        assertEquals(15,this.stereo.getVolume());
    }

    @Test
    void setVolume() {
    }
}