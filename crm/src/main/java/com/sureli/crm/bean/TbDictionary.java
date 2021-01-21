package com.sureli.crm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.ToString;
@ToString
public class TbDictionary {
    private Long rowId;

    private Long dictionaryParentId;

    private String dictionaryValue;

    private Integer dictionaryOrder;

    private Integer activeFlag;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String dictionaryInfo;
    
    private List<TbDictionary> children =new ArrayList<TbDictionary>();

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getDictionaryParentId() {
        return dictionaryParentId;
    }

    public void setDictionaryParentId(Long dictionaryParentId) {
        this.dictionaryParentId = dictionaryParentId;
    }

    public String getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue == null ? null : dictionaryValue.trim();
    }

    public Integer getDictionaryOrder() {
        return dictionaryOrder;
    }

    public void setDictionaryOrder(Integer dictionaryOrder) {
        this.dictionaryOrder = dictionaryOrder;
    }

    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDictionaryInfo() {
        return dictionaryInfo;
    }

    public void setDictionaryInfo(String dictionaryInfo) {
        this.dictionaryInfo = dictionaryInfo == null ? null : dictionaryInfo.trim();
    }

	public List<TbDictionary> getChildren() {
		return children;
	}

	public void setChildren(List<TbDictionary> children) {
		this.children = children;
	}
    
}