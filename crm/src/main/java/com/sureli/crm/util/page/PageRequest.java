package com.sureli.crm.util.page;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class PageRequest implements Serializable {

		
	private static final long serialVersionUID = 1L;
	/**
     * 当前页码
     */
    private int pageNum;
    /**
     	* 每页数量
     */
	private int pageSize;
}
