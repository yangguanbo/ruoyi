package com.ruoyi.pb.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.pb.domain.Item;
import com.ruoyi.pb.service.IItemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 指标管理Controller
 * 
 * @author Yang
 * @date 2020-12-14
 */
@RestController
@RequestMapping("/pb/item")
public class ItemController extends BaseController
{
    @Autowired
    private IItemService itemService;

    /**
     * 查询指标管理列表
     */
    @PreAuthorize("@ss.hasPermi('pb:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(Item item)
    {
        startPage();
        List<Item> list = itemService.selectItemList(item);
        return getDataTable(list);
    }

    /**
     * 导出指标管理列表
     */
    @PreAuthorize("@ss.hasPermi('pb:item:export')")
    @Log(title = "指标管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Item item)
    {
        List<Item> list = itemService.selectItemList(item);
        ExcelUtil<Item> util = new ExcelUtil<Item>(Item.class);
        return util.exportExcel(list, "item");
    }

    /**
     * 获取指标管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('pb:item:query')")
    @GetMapping(value = "/{itemid}")
    public AjaxResult getInfo(@PathVariable("itemid") Long itemid)
    {
        return AjaxResult.success(itemService.selectItemById(itemid));
    }

    /**
     * 新增指标管理
     */
    @PreAuthorize("@ss.hasPermi('pb:item:add')")
    @Log(title = "指标管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Item item)
    {
        return toAjax(itemService.insertItem(item));
    }

    /**
     * 修改指标管理
     */
    @PreAuthorize("@ss.hasPermi('pb:item:edit')")
    @Log(title = "指标管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Item item)
    {
        return toAjax(itemService.updateItem(item));
    }

    /**
     * 删除指标管理
     */
    @PreAuthorize("@ss.hasPermi('pb:item:remove')")
    @Log(title = "指标管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemids}")
    public AjaxResult remove(@PathVariable Long[] itemids)
    {
        return toAjax(itemService.deleteItemByIds(itemids));
    }
}
