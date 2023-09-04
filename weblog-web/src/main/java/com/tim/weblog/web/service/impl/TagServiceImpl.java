package com.tim.weblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.mapper.TagMapper;
import com.tim.weblog.common.domain.dos.TagDO;
import com.tim.weblog.web.dao.TagDao;
import com.tim.weblog.web.model.vo.tag.QueryTagListItemRspVO;
import com.tim.weblog.web.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class TagServiceImpl extends ServiceImpl<TagMapper, TagDO> implements TagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public Response queryTagList() {
        List<TagDO> tagDOS = tagDao.selectAllTag();
        List<QueryTagListItemRspVO> list = null;

        if (!CollectionUtils.isEmpty(tagDOS)) {
            list = tagDOS.stream()
                    .map(p -> QueryTagListItemRspVO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .build())
                    .collect(Collectors.toList());
        }

        return Response.success(list);
    }
}
