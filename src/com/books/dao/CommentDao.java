package com.books.dao;

import java.util.List;

import com.books.model.Comment;

/**
* @ClassName: CommentDao
* @Description: ���۽ӿ�
* @author ���³�
* @date 2018��12��19������5:23:12
*
*/
public interface CommentDao {

	//��ѯ����
	public List<Comment> selectCommentAll();
	
	//����
	public int insertComment(Comment comment);
	
	//ͨ��bmId�޸�
	public int updateComment(Comment comment);
	
	//ͨ��bmIdɾ��
	public int deleteComment(Integer bmId);
}
