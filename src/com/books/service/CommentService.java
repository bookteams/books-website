package com.books.service;

import java.util.List;

import com.books.model.Comment;

/**
* @ClassName: CommentService
* @Description: ����ҵ��ӿ�
* @author ���³�
* @date 2018��12��20������3:23:23
*
*/
public interface CommentService {

	//��ѯ����
	public List<Comment> selectCommentAll();
		
	//����
	public int insertComment(Comment comment);
		
	//ͨ��bmId�޸�
	public int updateComment(Comment comment);
		
	//ͨ��bmIdɾ��
	public int deleteComment(Integer bmId);
}
