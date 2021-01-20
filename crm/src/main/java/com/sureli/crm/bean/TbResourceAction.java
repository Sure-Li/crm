package com.sureli.crm.bean;

import java.util.Date;

public class TbResourceAction {
    private Long rowId;

    private Long resourceId;

    private String resourceActionMethod;

    private String resourceActionUrl;

    private Integer activeFlag;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceActionMethod() {
        return resourceActionMethod;
    }

    public void setResourceActionMethod(String resourceActionMethod) {
        this.resourceActionMethod = resourceActionMethod == null ? null : resourceActionMethod.trim();
    }

    public String getResourceActionUrl() {
        return resourceActionUrl;
    }

    public void setResourceActionUrl(String resourceActionUrl) {
        this.resourceActionUrl = resourceActionUrl == null ? null : resourceActionUrl.trim();
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
}