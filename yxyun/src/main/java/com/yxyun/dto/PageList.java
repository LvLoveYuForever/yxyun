package com.yxyun.dto;

import java.util.List;

public class PageList<T>{
	
	private long totalRecond;//总记录数
	
	private int totalPages;//总页数
	
	private int currentPage;//当前页
	
	private int pageSize;//每页记录数
	
	private List<T> pageList;//每一页的记录list

	public long getTotalRecond() {
		return totalRecond;
	}

	public void setTotalRecond(long totalRecond) {
		this.totalRecond = totalRecond;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getPageList() {
		return pageList;
	}

	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	
	

}
