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
import com.ruoyi.pb.domain.Opentime;
import com.ruoyi.pb.service.IOpentimeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设置开放时间Controller
 * 
 * @author Yang
 * @date 2020-12-17
 */
@RestController
@RequestMapping("/pb/opentime")
public class OpentimeController extends BaseController
{
    @Autowired
    private IOpentimeService opentimeService;

    /**
     * 查询设置开放时间列表
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:list')")
    @GetMapping("/list")
    public TableDataInfo list(Opentime opentime)
    {
        startPage();
        List<Opentime> list = opentimeService.selectOpentimeList(opentime);
        return getDataTable(list);
    }

    /**
     * 导出设置开放时间列表
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:export')")
    @Log(title = "设置开放时间", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Opentime opentime)
    {
        List<Opentime> list = opentimeService.selectOpentimeList(opentime);
        ExcelUtil<Opentime> util = new ExcelUtil<Opentime>(Opentime.class);
        return util.exportExcel(list, "opentime");
    }

    /**
     * 获取设置开放时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:query')")
    @GetMapping(value = "/{rid}")
    public AjaxResult getInfo(@PathVariable("rid") Long rid)
    {
        return AjaxResult.success(opentimeService.selectOpentimeById(rid));
    }

    /**
     * 新增设置开放时间
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:add')")
    @Log(title = "设置开放时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Opentime opentime)
    {
        return toAjax(opentimeService.insertOpentime(opentime));
    }

    /**
     * 修改设置开放时间
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:edit')")
    @Log(title = "设置开放时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Opentime opentime)
    {
        return toAjax(opentimeService.updateOpentime(opentime));
    }

    /**
     * 删除设置开放时间
     */
    @PreAuthorize("@ss.hasPermi('pb:opentime:remove')")
    @Log(title = "设置开放时间", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rids}")
    public AjaxResult remove(@PathVariable Long[] rids)
    {
        return toAjax(opentimeService.deleteOpentimeByIds(rids));
    }
}
