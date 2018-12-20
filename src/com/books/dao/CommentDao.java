package com.books.dao;

import java.util.List;

import com.books.model.Comment;

/**
* @ClassName: CommentDao
* @Description: 评论接口
* @author 李勇超
* @date 2018年12月19日下午5:23:12
*
*/
public interface CommentDao {

	//查询所有
	public List<Comment> selectCommentAll();
	
	//增加
	public int insertComment(Comment comment);
	
	//通过bmId修改
	public int updateComment(Comment comment);
	
	//通过bmId删除
	public int deleteComment(Integer bmId);
}
