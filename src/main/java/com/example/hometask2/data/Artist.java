package com.example.hometask2.data;

import java.util.List;

public class Artist extends AbstractData<Artist> {

    private String artistName;
    private List<Painting> paintingList;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Painting> getPaintingList() {
        return paintingList;
    }

    public void setPaintingList(List<Painting> paintingList) {
        this.paintingList = paintingList;
    }
}
