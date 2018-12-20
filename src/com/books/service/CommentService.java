package com.books.service;

import java.util.List;

import com.books.model.Comment;

/**
* @ClassName: CommentService
* @Description: 评论业务接口
* @author 李勇超
* @date 2018年12月20日下午3:23:23
*
*/
public interface CommentService {

	//查询所有
	public List<Comment> selectCommentAll();
		
	//增加
	public int insertComment(Comment comment);
		
	//通过bmId修改
	public int updateComment(Comment comment);
		
	//通过bmId删除
	public int deleteComment(Integer bmId);
}
