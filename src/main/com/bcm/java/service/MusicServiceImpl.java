package service;

import bean.Music;
import mapper.MusicMapper;

import java.util.List;

public class MusicServiceImpl implements MusicService {

    private MusicMapper musicMapper;

    public MusicServiceImpl(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }

    @Override
    public List<Music> searchMusicByAlbumId(int albumId) {
        return musicMapper.searchMusicByAlbumId(albumId);
    }

    @Override
    public List<Music> searchMusicByMusicName(String musicName) {
        return musicMapper.searchMusicByMusicName(musicName);
    }

    @Override
    public List<Music> searchMusicBySingerId(int singerId) {
        return musicMapper.searchMusicBySingerId(singerId);
    }

    @Override
    public int favorMusic(int userId, int musicId) {
        return musicMapper.favorMusic(userId, musicId);
    }

    @Override
    public int unFavorMusic(int userId, int musicId) {
        return musicMapper.unFavorMusic(userId, musicId);
    }

}
