package com.stem.core.commons;

import java.util.List;

public class Pagination<T> {

	public static int ROWS = 5;
	
	private int pageIndex;

	private int pageSize;

	private int total;

	private List<T> data;

	private int pages;

	private int start;

	private int end;

	private int next;

	private int prev;

	public Pagination() {
		this(0, 1);
	}

	public Pagination(int total, int pageIndex) {
		this(total, pageIndex, ROWS);
	}

	public Pagination(int total, int pageIndex, int pageSize) {
		super();
		this.total = total;
		this.pageIndex = pageIndex == 0 ? 1 : pageIndex;
		this.pageSize = pageSize;
		this.pages = (int) Math.ceil((total + 0.0) / pageSize);
		if(this.pageIndex>=pages){
			this.pageIndex = pages;
		}
		count();
		nextAndPrevious(this.pageIndex);
	}

	private void nextAndPrevious(int pageIndex) {
		next = pageIndex + 1;
		prev = pageIndex - 1;
		if (!hasPreview())
			prev = pageIndex;
		if (!hasNext())
			next = pageIndex;
	}

	private void count() {
		this.start = pageSize * (pageIndex - 1);
		this.end = pageSize * (pageIndex);
		if (this.end > total) {
			this.end = total;
		}
	}

	/**
	 * 当前页是否有上一页
	 * 
	 * @return
	 */
	public boolean hasPreview() {
		if (pages > 1 && pageIndex > 1) {
			return true;
		}
		return false;
	}

	/**
	 * 当前页是否有下一页
	 * 
	 * @return
	 */
	public boolean hasNext() {
		if (pages > 1 && pageIndex < pages) {
			return true;
		}
		return false;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

}
