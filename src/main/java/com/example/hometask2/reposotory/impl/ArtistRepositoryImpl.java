package com.example.hometask2.reposotory.impl;

import com.example.hometask2.data.Artist;
import com.example.hometask2.data.Painting;
import com.example.hometask2.reposotory.ArtistRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArtistRepositoryImpl implements ArtistRepository {

    private final List<Artist> artistList = new ArrayList<>();

    @Override
    public Artist findByArtistName(String artistName) {
        Artist artist = null;
            for (Artist artists : artistList) {
                if(artist.getArtistName().equals(artistName)) {
                    artist = artists;
                }
            }
        return artist;
    }

    @Override
    public Artist findByPaintingName(String paintingName) {
        Artist artist = null;
        for(Artist artists : artistList) {
            for(Painting paintings : artists.getPaintingList()) {
                if(paintings.getPaintingName().equals(paintingName)) {
                    artist = artists;
                }
            }
        }
        return artist;
    }

    @Override
    public Artist findByPaintingId(Long paintingId) {

        Artist artist = null;
        for(Artist artists : artistList) {
            if(artists.getId().equals(paintingId)) {
                artist = artists;
            }
        }
        return artist;
    }

    @Override
    public void save(Artist artist) {
        artistList.add(artist);
    }

    @Override
    public Artist findById(Long id) {
        Artist artist = null;
        for (Artist artists : artistList) {
            if(artist.getId().equals(id)) {
                artist = artists;
            }
        }
        return artist;
    }

    @Override
    public List<Artist> findAll() {
        return artistList;
    }

    @Override
    public void update(Artist artist) {
        for(Artist artists : artistList) {
            if(artists.getId().equals(artist.getId())) {
                artist.setPaintingList(artist.getPaintingList());
                artist.setArtistName(artist.getArtistName());
            }
        }
    }

    @Override
    public void remove(Long id) {
        for(int i = 0; i < artistList.size(); i++) {
            if(artistList.get(i).getId().equals(id)) {
                artistList.remove(i);
            }
        }
    }
}
