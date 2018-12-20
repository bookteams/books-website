package com.books.dao.impl;

import java.util.List;

import org.apache.commons.lang.math.IntRange;

import com.books.dao.CommentDao;
import com.books.model.Comment;
import com.books.util.SqlHelper;

/**
* @ClassName: CommentDaoImpl
* @Description: 评论操作
* @author 李勇超
* @date 2018年12月19日下午5:14:28
*
*/
public class CommentDaoImpl implements CommentDao {

	//查询所有
	@Override
	public List<Comment> selectCommentAll(){
		return SqlHelper.executeQuery(Comment.class, "select * from book_comment");
	}
	
	//增加
	@Override
	public int insertComment(Comment comment) {
		return SqlHelper.executeInsert("book_comment", comment);
	}
	
	//通过bmId修改
	@Override
	public int updateComment(Comment comment) {
		return SqlHelper.executeUpdate("book_comment", comment, "where bmId="+comment.getBmId());
	}
	
	//通过bmId删除
	@Override
	public int deleteComment(Integer bmId) {
		return SqlHelper.executeNoQuery("delete from book_comment where bmId="+bmId);
	}
	
}
