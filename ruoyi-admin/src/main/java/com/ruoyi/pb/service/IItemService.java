package com.ruoyi.pb.service;

import java.util.List;
import com.ruoyi.pb.domain.Item;

/**
 * 指标管理Service接口
 * 
 * @author Yang
 * @date 2020-12-14
 */
public interface IItemService 
{
    /**
     * 查询指标管理
     * 
     * @param itemid 指标管理ID
     * @return 指标管理
     */
    public Item selectItemById(Long itemid);

    /**
     * 查询指标管理列表
     * 
     * @param item 指标管理
     * @return 指标管理集合
     */
    public List<Item> selectItemList(Item item);

    /**
     * 新增指标管理
     * 
     * @param item 指标管理
     * @return 结果
     */
    public int insertItem(Item item);

    /**
     * 修改指标管理
     * 
     * @param item 指标管理
     * @return 结果
     */
    public int updateItem(Item item);

    /**
     * 批量删除指标管理
     * 
     * @param itemids 需要删除的指标管理ID
     * @return 结果
     */
    public int deleteItemByIds(Long[] itemids);

    /**
     * 删除指标管理信息
     * 
     * @param itemid 指标管理ID
     * @return 结果
     */
    public int deleteItemById(Long itemid);
}
