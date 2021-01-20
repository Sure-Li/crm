package com.sureli.crm.bean;

import java.util.Date;

public class TbClient {
    private Long rowId;

    private String clientCode;

    private Integer clientFrom;

    private Integer clientCareer;

    private String clientDocumentaryWay;

    private Integer clientSex;

    private Integer activeFlag;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String clientInfo;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
    }

    public Integer getClientFrom() {
        return clientFrom;
    }

    public void setClientFrom(Integer clientFrom) {
        this.clientFrom = clientFrom;
    }

    public Integer getClientCareer() {
        return clientCareer;
    }

    public void setClientCareer(Integer clientCareer) {
        this.clientCareer = clientCareer;
    }

    public String getClientDocumentaryWay() {
        return clientDocumentaryWay;
    }

    public void setClientDocumentaryWay(String clientDocumentaryWay) {
        this.clientDocumentaryWay = clientDocumentaryWay == null ? null : clientDocumentaryWay.trim();
    }

    public Integer getClientSex() {
        return clientSex;
    }

    public void setClientSex(Integer clientSex) {
        this.clientSex = clientSex;
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

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo == null ? null : clientInfo.trim();
    }
}