package com.example.hometask2.reposotory;

import com.example.hometask2.data.Painting;

import java.util.List;

public interface PaintingRepository extends AbstractRepository<Painting> {

    Painting findByPaintingName(String paintingName);
    List<Painting> findByArtistId(Long artistId);

}
