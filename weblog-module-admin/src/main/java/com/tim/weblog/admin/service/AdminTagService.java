package com.tim.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.tim.weblog.common.domain.dos.TagDO;
import com.tim.weblog.admin.model.vo.tag.AddTagReqVO;
import com.tim.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.tim.weblog.admin.model.vo.tag.QueryTagPageListReqVO;
import com.tim.weblog.common.Response;


public interface AdminTagService extends IService<TagDO> {
    Response addTags(AddTagReqVO addTagReqVO);

    Response queryTagPageList(QueryTagPageListReqVO queryTagPageListReqVO);

    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    Response searchTags(SearchTagReqVO searchTagReqVO);

    Response queryTagSelectList();
}
