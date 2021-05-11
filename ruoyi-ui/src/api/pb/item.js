import request from '@/utils/request'

// 查询指标管理列表
export function listItem(query) {
  return request({
    url: '/pb/item/list',
    method: 'get',
    params: query
  })
}

// 查询指标管理详细
export function getItem(itemid) {
  return request({
    url: '/pb/item/' + itemid,
    method: 'get'
  })
}

// 新增指标管理
export function addItem(data) {
  return request({
    url: '/pb/item',
    method: 'post',
    data: data
  })
}

// 修改指标管理
export function updateItem(data) {
  return request({
    url: '/pb/item',
    method: 'put',
    data: data
  })
}

// 删除指标管理
export function delItem(itemid) {
  return request({
    url: '/pb/item/' + itemid,
    method: 'delete'
  })
}

// 导出指标管理
export function exportItem(query) {
  return request({
    url: '/pb/item/export',
    method: 'get',
    params: query
  })
}