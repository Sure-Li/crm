package com.sureli.crm.layuiresult;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LayuiResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer code;// 0:成功; 1:失败;
	private String msg;// 响应的信息，如果成功可以为空，如果失败，则需要提供信息。
	private Long count;// 给表单分页使用的
	private List<?> data;

	public LayuiResult() {
	}

	public LayuiResult(Long count, List<?> data) {
		this.code = 0;
		this.count = count;
		this.data = data;
	}

}
