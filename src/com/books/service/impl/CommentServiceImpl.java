package com.books.service.impl;

import java.util.List;

import com.books.dao.CommentDao;
import com.books.dao.impl.CommentDaoImpl;
import com.books.model.Comment;
import com.books.service.CommentService;

/**
* @ClassName: CommentServiceImpl
* @Description: 评论业务实现
* @author 李勇超
* @date 2018年12月20日下午3:24:41
*
*/
public class CommentServiceImpl implements CommentService{

	private CommentDao commentDao=new CommentDaoImpl();
	
	@Override
	public List<Comment> selectCommentAll() {
		return commentDao.selectCommentAll();
	}

	@Override
	public int insertComment(Comment comment) {
		return commentDao.insertComment(comment);
	}

	@Override
	public int updateComment(Comment comment) {
		return commentDao.updateComment(comment);
	}

	@Override
	public int deleteComment(Integer bmId) {
		return commentDao.deleteComment(bmId);
	}

}
