package com.ruoyi.pb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.pb.mapper.OpentimeMapper;
import com.ruoyi.pb.domain.Opentime;
import com.ruoyi.pb.service.IOpentimeService;

/**
 * 设置开放时间Service业务层处理
 * 
 * @author Yang
 * @date 2020-12-17
 */
@Service
public class OpentimeServiceImpl implements IOpentimeService 
{
    @Autowired
    private OpentimeMapper opentimeMapper;

    /**
     * 查询设置开放时间
     * 
     * @param rid 设置开放时间ID
     * @return 设置开放时间
     */
    @Override
    public Opentime selectOpentimeById(Long rid)
    {
        return opentimeMapper.selectOpentimeById(rid);
    }

    /**
     * 查询设置开放时间列表
     * 
     * @param opentime 设置开放时间
     * @return 设置开放时间
     */
    @Override
    public List<Opentime> selectOpentimeList(Opentime opentime)
    {
        return opentimeMapper.selectOpentimeList(opentime);
    }

    /**
     * 新增设置开放时间
     * 
     * @param opentime 设置开放时间
     * @return 结果
     */
    @Override
    public int insertOpentime(Opentime opentime)
    {
        return opentimeMapper.insertOpentime(opentime);
    }

    /**
     * 修改设置开放时间
     * 
     * @param opentime 设置开放时间
     * @return 结果
     */
    @Override
    public int updateOpentime(Opentime opentime)
    {
        return opentimeMapper.updateOpentime(opentime);
    }

    /**
     * 批量删除设置开放时间
     * 
     * @param rids 需要删除的设置开放时间ID
     * @return 结果
     */
    @Override
    public int deleteOpentimeByIds(Long[] rids)
    {
        return opentimeMapper.deleteOpentimeByIds(rids);
    }

    /**
     * 删除设置开放时间信息
     * 
     * @param rid 设置开放时间ID
     * @return 结果
     */
    @Override
    public int deleteOpentimeById(Long rid)
    {
        return opentimeMapper.deleteOpentimeById(rid);
    }
}
