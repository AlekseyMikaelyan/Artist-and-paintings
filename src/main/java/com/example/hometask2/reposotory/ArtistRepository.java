package com.example.hometask2.reposotory;

import com.example.hometask2.data.Artist;

import java.util.List;

public interface ArtistRepository extends AbstractRepository<Artist> {

    Artist findByArtistName(String artistName);
    Artist findByPaintingName(String paintingName);
    Artist findByPaintingId(Long paintingId);

}
