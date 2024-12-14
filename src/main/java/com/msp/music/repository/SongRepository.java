package com.msp.music.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msp.music.model.Song;
@Repository
public interface SongRepository extends JpaRepository<Song, Long>{
	List<Song> findByTitleContainingOrArtistContaining(String title, String artist);
}
