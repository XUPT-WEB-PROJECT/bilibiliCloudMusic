package service;

import bean.Music;
import bean.Singer;
import mapper.MusicMapper;
import mapper.SingerMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    private SingerMapper singerMapper;
    private MusicMapper musicMapper;

    public SingerServiceImpl(SingerMapper singerMapper, MusicMapper musicMapper) {
        this.singerMapper = singerMapper;
        this.musicMapper = musicMapper;
    }

    @Override
    public Singer searchSingerBySingerId(Integer singerId) {
        return singerMapper.searchSingerBySingerId(singerId);
    }

    @Override
    public List<Singer> searchSingerBySingerName(String singerName) {
        return singerMapper.searchSingerBySingerName(singerName);
    }

    @Override
    public Singer searchSingerByAlbumId(Integer albumId) {
        return singerMapper.searchSingerByAlbumId(albumId);
    }

    @Override
    public JSONObject searchSingerInfoByName(String singerName) {
        List<Singer> singers = singerMapper.searchSingerBySingerName(singerName);
        if(singers.size()==0)return null;
        Singer singer = singers.get(0);
        int musicCnt = singerMapper.cntMusicBySingerId(singer.getSingerId());
        int albumCnt = singerMapper.cntAlbumBySingerId(singer.getSingerId());
        JSONObject object = new JSONObject(singer);
        object.put("musicCnt", musicCnt);
        object.put("albumCnt", albumCnt);
        List<Music> musicList = musicMapper.searchPageMusicBySingerId(singer.getSingerId());
        object.put("musicList", musicList);
        return object;
    }
}
