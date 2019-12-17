package service;

import bean.Album;
import mapper.AlbumMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private AlbumMapper albumMapper;

    public AlbumServiceImpl(AlbumMapper albumMapper) {
        this.albumMapper = albumMapper;
    }

    @Override
    public List<Album> searchAlbumByAlbumName(String albumName) {
        return albumMapper.searchAlbumByAlbumName(albumName);
    }

    @Override
    public List<Album> searchAlbumBySingerId(int singerId) {
        return albumMapper.searchAlbumBySingerId(singerId);
    }

    @Override
    public Album searchAlbumByMusicId(int musicId) {
        return albumMapper.searchAlbumByMusicId(musicId);
    }

    @Override
    public int favorAlbum(int uerId, int albumId) {
        return albumMapper.favorAlbum(uerId, albumId);
    }

    @Override
    public int unFavorAlbum(int uerId, int albumId) {
        return albumMapper.unFavorAlbum(uerId, albumId);
    }
}
