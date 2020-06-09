package com.example.hometask2.builder;

import com.example.hometask2.data.Artist;
import com.example.hometask2.data.Painting;
import com.example.hometask2.service.ArtistService;
import com.example.hometask2.service.PaintingService;
import com.example.hometask2.service.impl.ArtistServiceImpl;
import com.example.hometask2.service.impl.PaintingServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataBuilder implements AbstractDataBuilder {

    private final ArtistService artistService = new ArtistServiceImpl();
    private final PaintingService paintingService = new PaintingServiceImpl();

    @Override
    public void buildDataList() {
        for (Map.Entry<String, String> entry : getKeyValueMapByBundleProperties().entrySet()) {

            Artist artist = new Artist();
            String artistNameProperties = String.join(" ", entry.getKey().split("_"));
            artist.setArtistName(artistNameProperties);

            List<Painting> paintingList = new ArrayList<>();
            if (entry.getValue().contains(";")) {
                List<String> paintingNamePropertiesList = Arrays.asList(entry.getValue().split(";"));
                paintingNamePropertiesList.forEach(paintingName -> {
                    Painting painting = new Painting();
                    painting.setPaintingName(paintingName);
                    paintingService.saveOrUpdate(painting);
                    paintingList.add(paintingService.findByPaintingName(paintingName));
                });
            } else {
                Painting painting = new Painting();
                String paintingName = entry.getValue();
                painting.setPaintingName(paintingName);
                paintingService.saveOrUpdate(painting);
                paintingList.add(paintingService.findByPaintingName(paintingName));
            }

            artist.setPaintingList(paintingList);
            artistService.saveOrUpdate(artist);
        }

        paintingService.findAll().forEach(painting -> {
            Artist artist = artistService.findByPaintingName(painting.getPaintingName());
        });

        paintingService.findAll().forEach(painting -> {
            System.out.println("painting = " + painting.getPaintingName());
        });
    }

    public ArtistService getArtistService() {
        return artistService;
    }

    public PaintingService getPaintingService() {
        return paintingService;
    }
}
