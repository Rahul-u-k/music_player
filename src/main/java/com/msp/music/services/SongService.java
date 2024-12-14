package com.msp.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msp.music.model.Song;
import com.msp.music.repository.SongRepository;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public List<Song> searchSongs(String query) {
        return songRepository.findByTitleContainingOrArtistContaining(query, query);
    }

    public Song getSong(Long id) {
        return songRepository.findById(id).orElseThrow(() -> new RuntimeException("Song not found"));
    }
}

