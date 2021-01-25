package com.sureli.crm.bean;

import java.util.Date;

public class TbUser {
    private Long rowId;

    private Long roleId;

    private String userName;

    private Integer userLevel;

    private Long userUpperLevelId;

    private String userCode;

    private String userPassword;

    private Integer userIsLock;

    private Integer userLoginCount;

    private String userLastLoginIp;

    private Date userLastLoginTime;

    private String userAvatar;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Long getUserUpperLevelId() {
        return userUpperLevelId;
    }

    public void setUserUpperLevelId(Long userUpperLevelId) {
        this.userUpperLevelId = userUpperLevelId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserIsLock() {
        return userIsLock;
    }

    public void setUserIsLock(Integer userIsLock) {
        this.userIsLock = userIsLock;
    }

    public Integer getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(Integer userLoginCount) {
        this.userLoginCount = userLoginCount;
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp == null ? null : userLastLoginIp.trim();
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
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
		return "TbUser [rowId=" + rowId + ", roleId=" + roleId + ", userName=" + userName + ", userLevel=" + userLevel
				+ ", userUpperLevelId=" + userUpperLevelId + ", userCode=" + userCode + ", userPassword=" + userPassword
				+ ", userIsLock=" + userIsLock + ", userLoginCount=" + userLoginCount + ", userLastLoginIp="
				+ userLastLoginIp + ", userLastLoginTime=" + userLastLoginTime + ", userAvatar=" + userAvatar
				+ ", activeFlag=" + activeFlag + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + "]";
	}
    
}