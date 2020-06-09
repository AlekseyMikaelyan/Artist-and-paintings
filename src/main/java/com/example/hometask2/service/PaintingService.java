package com.example.hometask2.service;

import com.example.hometask2.data.Painting;

import java.util.List;

public interface PaintingService extends AbstractService<Painting> {

    Painting findByPaintingName(String paintingName);
    List<Painting> findByArtistId(Long artistId);

}
