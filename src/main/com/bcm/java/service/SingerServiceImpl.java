package service;

import bean.Singer;
import mapper.SingerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    private SingerMapper singerMapper;

    public SingerServiceImpl(SingerMapper singerMapper) {
        this.singerMapper = singerMapper;
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
}
