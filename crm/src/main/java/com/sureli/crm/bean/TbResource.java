package com.sureli.crm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

public class TbResource {
    private Long rowId;

    private Long resourceParentId;

    private String resourceName;

    private Integer resourceType;

    private Integer resourceOrder;

    private String resourceUrl;

    private Integer activeFlag;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;
    
//    private List<TbResource> children =new ArrayList<TbResource>();

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getResourceParentId() {
        return resourceParentId;
    }

    public void setResourceParentId(Long resourceParentId) {
        this.resourceParentId = resourceParentId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getResourceOrder() {
        return resourceOrder;
    }

    public void setResourceOrder(Integer resourceOrder) {
        this.resourceOrder = resourceOrder;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
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

	@Override
	public String toString() {
		return "TbResource [id=" + rowId + ", pid=" + resourceParentId + ", resourceName="
				+ resourceName + ", resourceType=" + resourceType + ", resourceOrder=" + resourceOrder
				+ ", resourceUrl=" + resourceUrl + ", activeFlag=" + activeFlag + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}

//	public List<TbResource> getChildren() {
//		return children;
//	}
//
//	public void setChildren(List<TbResource> children) {
//		this.children = children;
//	}

    
}