package com.example.hometask2;

import com.example.hometask2.data.Artist;
import com.example.hometask2.service.ArtistService;
import com.example.hometask2.service.impl.ArtistServiceImpl;
import org.junit.Assert;
import org.junit.Test;


public class ArtistServiceTest {
    ArtistService artistService = new ArtistServiceImpl();
    @Test
    public void ArtistServiceShouldFindArtistByName() {
        artistService.findByArtistName("Pollock");
    }


    @Test
    public void ArtistServiceShouldFindArtistByPaintingName() {
        artistService.findByPaintingName("Boat");
    }

    @Test
    public void ArtistServiceShouldFindArtistByPaintingId() {
        artistService.findByPaintingId(1L);
    }

    @Test
    public void ArtistServiceShouldSaveOrUpdateNewArtist() {
        artistService.saveOrUpdate(new Artist());
        Assert.assertEquals(artistService.findAll().size(), 1);
    }

    @Test
    public void ArtistServiceShouldFindArtistById() {
        artistService.findById(1L);
    }

    @Test
    public void ArtistServiceShouldGiveAllArtistList() {
        artistService.findAll();
    }

    @Test
    public void ArtistServiceShouldRemoveArtistById() {
        artistService.remove(1L);
    }

}
