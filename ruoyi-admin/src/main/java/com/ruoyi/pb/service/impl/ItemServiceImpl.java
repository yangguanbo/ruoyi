package com.ruoyi.pb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.pb.mapper.ItemMapper;
import com.ruoyi.pb.domain.Item;
import com.ruoyi.pb.service.IItemService;

/**
 * 指标管理Service业务层处理
 * 
 * @author Yang
 * @date 2020-12-14
 */
@SuppressWarnings("ALL")
@Service
public class ItemServiceImpl implements IItemService 
{
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询指标管理
     * 
     * @param itemid 指标管理ID
     * @return 指标管理
     */
    @Override
    public Item selectItemById(Long itemid)
    {
        return itemMapper.selectItemById(itemid);
    }

    /**
     * 查询指标管理列表
     * 
     * @param item 指标管理
     * @return 指标管理
     */
    @Override
    public List<Item> selectItemList(Item item)
    {
        return itemMapper.selectItemList(item);
    }

    /**
     * 新增指标管理
     * 
     * @param item 指标管理
     * @return 结果
     */
    @Override
    public int insertItem(Item item)
    {
        return itemMapper.insertItem(item);
    }

    /**
     * 修改指标管理
     * 
     * @param item 指标管理
     * @return 结果
     */
    @Override
    public int updateItem(Item item)
    {
        return itemMapper.updateItem(item);
    }

    /**
     * 批量删除指标管理
     * 
     * @param itemids 需要删除的指标管理ID
     * @return 结果
     */
    @Override
    public int deleteItemByIds(Long[] itemids)
    {
        return itemMapper.deleteItemByIds(itemids);
    }

    /**
     * 删除指标管理信息
     * 
     * @param itemid 指标管理ID
     * @return 结果
     */
    @Override
    public int deleteItemById(Long itemid)
    {
        return itemMapper.deleteItemById(itemid);
    }
}
