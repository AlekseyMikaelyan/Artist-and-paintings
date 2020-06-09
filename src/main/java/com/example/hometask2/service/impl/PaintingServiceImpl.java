package com.example.hometask2.service.impl;

import com.example.hometask2.data.Artist;
import com.example.hometask2.data.Painting;
import com.example.hometask2.reposotory.PaintingRepository;
import com.example.hometask2.reposotory.impl.PaintingRepositoryImpl;
import com.example.hometask2.service.PaintingService;

import java.util.List;

public class PaintingServiceImpl implements PaintingService {

        PaintingRepository paintingRepository = new PaintingRepositoryImpl();

    @Override
    public Painting findByPaintingName(String paintingName) {
        return paintingRepository.findByPaintingName(paintingName);
    }

    @Override
    public List<Painting> findByArtistId(Long artistId) {
        return paintingRepository.findByArtistId(artistId);
    }

    @Override
    public void saveOrUpdate(Painting painting) {
        if (painting.getId() == null) {
            long id = findAll().size();
            painting.setId(++id);
            paintingRepository.save(painting);
        } else {
            paintingRepository.update(painting);
        }
    }

    @Override
    public Painting findById(Long id) {
        return paintingRepository.findById(id);
    }

    @Override
    public List<Painting> findAll() {
        return paintingRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        paintingRepository.remove(id);
    }
}
