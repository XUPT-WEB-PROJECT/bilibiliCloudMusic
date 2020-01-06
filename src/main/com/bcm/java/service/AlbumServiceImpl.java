package service;

import bean.Album;
import bean.Music;
import mapper.AlbumMapper;
import mapper.MusicMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private AlbumMapper albumMapper;
    private MusicMapper musicMapper;

    public AlbumServiceImpl(AlbumMapper albumMapper, MusicMapper musicMapper) {
        this.albumMapper = albumMapper;
        this.musicMapper = musicMapper;
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

    @Override
    public JSONObject getAlbumPageInfo(String albumName) {
        List<Album> albums = albumMapper.searchAlbumByAlbumName(albumName);
        if(albums.size()==0) return null;
        List<Music> musicList = musicMapper.searchMusicByAlbumId(albums.get(0).getAlbumId());
        List<Album> albumList = albumMapper.searchAlbumBySingerId(albums.get(0).getSingerId());
        JSONObject re = new JSONObject(albums.get(0));
        re.put("musicList", musicList);
        re.put("albumList", albumList);
        return re;
    }
}
