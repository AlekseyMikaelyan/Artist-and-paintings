package com.example.hometask2.reposotory.impl;

import com.example.hometask2.data.Artist;
import com.example.hometask2.data.Painting;
import com.example.hometask2.reposotory.PaintingRepository;

import java.util.ArrayList;
import java.util.List;

public class PaintingRepositoryImpl implements PaintingRepository {

    private final List<Painting> paintingList = new ArrayList<>();

    @Override
    public Painting findByPaintingName(String paintingName) {

        Painting painting = null;
        for (Painting paintings : paintingList) {
            if(paintings.getPaintingName().equals(paintingName)) {
                painting = paintings;
            }
        }
        return painting;

    }

    @Override
    public List<Painting> findByArtistId(Long artistId) {

        List<Painting> list = new ArrayList<>();
        for(Painting paintings : paintingList) {
            if(paintings.getArtistId().equals(artistId)) {
                list.add(paintings);
            }
        }
        return list;
    }

    @Override
    public void save(Painting painting) {
        paintingList.add(painting);
    }

    @Override
    public Painting findById(Long id) {

        Painting painting = null;
        for(Painting paintings : paintingList) {
            if(paintings.getId().equals(id)) {
                painting = paintings;
            }
        }
        return painting;
    }

    @Override
    public List<Painting> findAll() {
        return paintingList;
    }

    @Override
    public void update(Painting painting) {
        for(Painting paintings : paintingList) {
            if(paintings.getId().equals(painting.getId())) {
                painting.setArtistId(painting.getArtistId());
                painting.setPaintingName(painting.getPaintingName());
            }
        }
    }

    @Override
    public void remove(Long id) {
        for(int i = 0; i < paintingList.size(); i++) {
            if(paintingList.get(i).getId().equals(id)) {
                paintingList.remove(i);
            }
        }
    }
}
