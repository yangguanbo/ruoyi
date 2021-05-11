package com.ruoyi.pb.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设置开放时间对象 opentime
 * 
 * @author Yang
 * @date 2020-12-17
 */
public class Opentime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long rid;

    /** 开放年度 */
    @Excel(name = "开放年度")
    private Long openyear;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date starttime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endtime;

    /** $column.columnComment */
    private String phasecode;

    /** 项目ID */
    private String projectid;

    /** 是否可用 */
    @Excel(name = "是否可用")
    private Integer isused;

    public void setRid(Long rid) 
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }
    public void setOpenyear(Long openyear) 
    {
        this.openyear = openyear;
    }

    public Long getOpenyear() 
    {
        return openyear;
    }
    public void setStarttime(Date starttime) 
    {
        this.starttime = starttime;
    }

    public Date getStarttime() 
    {
        return starttime;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setPhasecode(String phasecode) 
    {
        this.phasecode = phasecode;
    }

    public String getPhasecode() 
    {
        return phasecode;
    }
    public void setProjectid(String projectid) 
    {
        this.projectid = projectid;
    }

    public String getProjectid() 
    {
        return projectid;
    }
    public void setIsused(Integer isused)
    {
        this.isused = isused;
    }

    public Integer getIsused() 
    {
        return isused;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rid", getRid())
            .append("openyear", getOpenyear())
            .append("starttime", getStarttime())
            .append("endtime", getEndtime())
            .append("phasecode", getPhasecode())
            .append("projectid", getProjectid())
            .append("isused", getIsused())
            .toString();
    }
}
