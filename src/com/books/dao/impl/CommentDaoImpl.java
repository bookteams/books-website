package com.books.dao.impl;

import java.util.List;

import org.apache.commons.lang.math.IntRange;

import com.books.dao.CommentDao;
import com.books.model.Comment;
import com.books.util.SqlHelper;

/**
* @ClassName: CommentDaoImpl
* @Description: ���۲���
* @author ���³�
* @date 2018��12��19������5:14:28
*
*/
public class CommentDaoImpl implements CommentDao {

	//��ѯ����
	@Override
	public List<Comment> selectCommentAll(){
		return SqlHelper.executeQuery(Comment.class, "select * from book_comment");
	}
	
	//����
	@Override
	public int insertComment(Comment comment) {
		return SqlHelper.executeInsert("book_comment", comment);
	}
	
	//ͨ��bmId�޸�
	@Override
	public int updateComment(Comment comment) {
		return SqlHelper.executeUpdate("book_comment", comment, "where bmId="+comment.getBmId());
	}
	
	//ͨ��bmIdɾ��
	@Override
	public int deleteComment(Integer bmId) {
		return SqlHelper.executeNoQuery("delete from book_comment where bmId="+bmId);
	}
	
}
