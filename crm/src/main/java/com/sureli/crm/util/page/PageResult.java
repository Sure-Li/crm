package com.sureli.crm.util.page;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PageResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 数据模型
     */
    private List<?> content;
}
