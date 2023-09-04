package com.tim.weblog.web.dao;

import com.tim.weblog.common.domain.dos.TagDO;

import java.util.List;

public interface TagDao {
    List<TagDO> selectAllTag();

    List<TagDO> selectByTagIds(List<Long> tagIds);
}
