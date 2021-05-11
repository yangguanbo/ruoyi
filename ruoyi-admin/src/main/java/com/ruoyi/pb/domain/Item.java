package com.ruoyi.pb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 指标管理对象 item
 * 
 * @author Yang
 * @date 2020-12-14
 */
public class Item extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 指标号 */
    @Excel(name = "指标号")
    private Long itemid;

    /** 指标名 */
    @Excel(name = "指标名")
    private String itemname;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30,dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 是否可用 */
    @Excel(name = "是否可用")
    private Integer isused;
    private Date Createtime;

    public void setItemid(Long itemid) 
    {
        this.itemid = itemid;
    }

    public Long getItemid() 
    {
        return itemid;
    }
    public void setItemname(String itemname) 
    {
        this.itemname = itemname;
    }

    public String getItemname() 
    {
        return itemname;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
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
            .append("itemid", getItemid())
            .append("itemname", getItemname())
            .append("createtime", getCreatetime())
            .append("creator", getCreator())
            .append("isused", getIsused())
            .toString();
    }


    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreatetime() {
        return Createtime;
    }

    public void setCreatetime(Date createtime) {
        this.Createtime = createtime;
    }
}
