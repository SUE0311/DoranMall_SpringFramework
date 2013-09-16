package com.doranMall.persistence;

import java.util.List;

import com.doranMall.domain.WishlistBean;

public interface WishlistService {
	
	/*목록 보기*/
	public List<WishlistBean> getWishlist(int page, int limit);
	
	/*검색하여 보기*/
	public List<WishlistBean> getSearchWishlist(int page, int limit, String searchWish);
	
	/*총 목록 수*/
	public int getListCount();
	
	/*희망신청 글 등록*/
	public void insertWishlist(WishlistBean wishlist);
	
	/*답변글 저장*/
	public void insertReply(WishlistBean wishlist);
	
	/*조회수 증가*/
	public void addHit(int num);
	
	/*추천수 증가(Ajax)*/
	public int addGood(int num);
	
	/*게시물 내용 가져오기*/
	public WishlistBean getCont(int num);
	
	/*게시물 수정*/
	public void editWishlist(WishlistBean wishlist);
	
	/*게시물 삭제*/
	public void deleteWishlist(int wishlist_num);
	
}
