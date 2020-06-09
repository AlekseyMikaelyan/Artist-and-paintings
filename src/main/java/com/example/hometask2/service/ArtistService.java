package com.example.hometask2.service;

import com.example.hometask2.data.Artist;

public interface ArtistService extends AbstractService<Artist> {

    Artist findByArtistName(String artistName);
    Artist findByPaintingName(String paintingName);
    Artist findByPaintingId(Long paintingId);

}
