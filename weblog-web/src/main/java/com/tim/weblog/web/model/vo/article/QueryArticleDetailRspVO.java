package com.tim.weblog.web.model.vo.article;

import com.tim.weblog.web.model.vo.tag.QueryTagListItemRspVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-19 16:06
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QueryArticleDetailRspVO {
    private String title;
    private String content;
    private Date updateTime;
    private Long categoryId;
    private String categoryName;
    private Long readNum;
    private List<QueryTagListItemRspVO> tags;
    private QueryArticleLinkRspVO preArticle;
    private QueryArticleLinkRspVO nextArticle;
}
