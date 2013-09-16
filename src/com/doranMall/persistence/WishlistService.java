package com.doranMall.persistence;

import java.util.List;

import com.doranMall.domain.WishlistBean;

public interface WishlistService {
	
	/*��� ����*/
	public List<WishlistBean> getWishlist(int page, int limit);
	
	/*�˻��Ͽ� ����*/
	public List<WishlistBean> getSearchWishlist(int page, int limit, String searchWish);
	
	/*�� ��� ��*/
	public int getListCount();
	
	/*�����û �� ���*/
	public void insertWishlist(WishlistBean wishlist);
	
	/*�亯�� ����*/
	public void insertReply(WishlistBean wishlist);
	
	/*��ȸ�� ����*/
	public void addHit(int num);
	
	/*��õ�� ����(Ajax)*/
	public int addGood(int num);
	
	/*�Խù� ���� ��������*/
	public WishlistBean getCont(int num);
	
	/*�Խù� ����*/
	public void editWishlist(WishlistBean wishlist);
	
	/*�Խù� ����*/
	public void deleteWishlist(int wishlist_num);
	
}
