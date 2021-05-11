import request from '@/utils/request'

// 查询设置开放时间列表
export function listOpentime(query) {
  return request({
    url: '/pb/opentime/list',
    method: 'get',
    params: query
  })
}

// 查询设置开放时间详细
export function getOpentime(rid) {
  return request({
    url: '/pb/opentime/' + rid,
    method: 'get'
  })
}

// 新增设置开放时间
export function addOpentime(data) {
  return request({
    url: '/pb/opentime',
    method: 'post',
    data: data
  })
}

// 修改设置开放时间
export function updateOpentime(data) {
  return request({
    url: '/pb/opentime',
    method: 'put',
    data: data
  })
}

// 删除设置开放时间
export function delOpentime(rid) {
  return request({
    url: '/pb/opentime/' + rid,
    method: 'delete'
  })
}

// 导出设置开放时间
export function exportOpentime(query) {
  return request({
    url: '/pb/opentime/export',
    method: 'get',
    params: query
  })
}