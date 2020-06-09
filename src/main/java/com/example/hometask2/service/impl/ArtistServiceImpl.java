package com.example.hometask2.service.impl;

import com.example.hometask2.data.Artist;
import com.example.hometask2.reposotory.ArtistRepository;
import com.example.hometask2.reposotory.impl.ArtistRepositoryImpl;
import com.example.hometask2.service.ArtistService;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository = new ArtistRepositoryImpl();

    @Override
    public Artist findByArtistName(String artistName) {
        return artistRepository.findByArtistName(artistName);
    }

    @Override
    public Artist findByPaintingName(String paintingName) {
        return artistRepository.findByPaintingName(paintingName);
    }

    @Override
    public Artist findByPaintingId(Long paintingId) {
        return artistRepository.findByPaintingId(paintingId);
    }

    @Override
    public void saveOrUpdate(Artist artist) {
        if (artist.getId() == null) {
            long id = findAll().size();
            artist.setId(++id);
            artistRepository.save(artist);
        } else {
            artistRepository.update(artist);
        }
    }

    @Override
    public Artist findById(Long id) {
        return artistRepository.findById(id);
    }

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        artistRepository.remove(id);
    }
}
