package com.github.richterplus.passport.api.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * passport-api请求数据
 */
public abstract class PassportApiReq {

    /**
     * 请求日期
     */
    @ApiModelProperty("请求日期")
    private Date requestDateTime = new Date();

	/**
	 * @return 请求日期
	 */
	public Date getRequestDateTime() {
		return requestDateTime;
	}

	/**
	 * @param requestDateTime 请求日期
	 */
	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
}