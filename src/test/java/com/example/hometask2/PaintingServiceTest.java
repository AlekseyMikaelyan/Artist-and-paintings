package com.example.hometask2;

import com.example.hometask2.data.Artist;
import com.example.hometask2.data.Painting;
import com.example.hometask2.service.PaintingService;
import com.example.hometask2.service.impl.PaintingServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class PaintingServiceTest {
    PaintingService paintingService = new PaintingServiceImpl();
    @Test
    public void PaintingServiceShouldFindPaintingByPaintingName() {
        paintingService.findByPaintingName("Boat");
    }

    @Test
    public void PaintingServiceShouldFindAllPaintingListByArtistId() {
        paintingService.findByArtistId(1L);
    }

    @Test
    public void PaintingServiceShouldSaveOrUpdateNewPainting() {
        paintingService.saveOrUpdate(new Painting());
        Assert.assertEquals(paintingService.findAll().size(), 1);
    }

    @Test
    public void PaintingServiceShouldFindPaintingByPaintingId() {
        paintingService.findById(1L);
    }

    @Test
    public void PaintingServiceShouldGiveAllPaintingList() {
        paintingService.findAll();
    }

    @Test
    public void PaintingServiceShouldRemovePaintingById() {
        paintingService.remove(1L);
    }
}
