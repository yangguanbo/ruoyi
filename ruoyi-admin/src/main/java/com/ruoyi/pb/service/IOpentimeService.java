package com.ruoyi.pb.service;

import java.util.List;
import com.ruoyi.pb.domain.Opentime;

/**
 * 设置开放时间Service接口
 * 
 * @author Yang
 * @date 2020-12-17
 */
public interface IOpentimeService 
{
    /**
     * 查询设置开放时间
     * 
     * @param rid 设置开放时间ID
     * @return 设置开放时间
     */
    public Opentime selectOpentimeById(Long rid);

    /**
     * 查询设置开放时间列表
     * 
     * @param opentime 设置开放时间
     * @return 设置开放时间集合
     */
    public List<Opentime> selectOpentimeList(Opentime opentime);

    /**
     * 新增设置开放时间
     * 
     * @param opentime 设置开放时间
     * @return 结果
     */
    public int insertOpentime(Opentime opentime);

    /**
     * 修改设置开放时间
     * 
     * @param opentime 设置开放时间
     * @return 结果
     */
    public int updateOpentime(Opentime opentime);

    /**
     * 批量删除设置开放时间
     * 
     * @param rids 需要删除的设置开放时间ID
     * @return 结果
     */
    public int deleteOpentimeByIds(Long[] rids);

    /**
     * 删除设置开放时间信息
     * 
     * @param rid 设置开放时间ID
     * @return 结果
     */
    public int deleteOpentimeById(Long rid);
}
