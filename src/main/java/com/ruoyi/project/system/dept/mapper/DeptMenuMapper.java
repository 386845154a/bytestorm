package com.ruoyi.project.system.dept.mapper;

import com.ruoyi.project.system.dept.domain.DeptMenu;
import com.ruoyi.project.system.role.domain.RoleMenu;

import java.util.List;

/**
 * 部门和菜单关联Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-22
 */
public interface DeptMenuMapper 
{
    /**
     * 查询部门和菜单关联
     * 
     * @param deptId 部门和菜单关联ID
     * @return 部门和菜单关联
     */
    public DeptMenu selectDeptMenuById(Long deptId);

    /**
     * 查询部门和菜单关联列表
     * 
     * @param deptMenu 部门和菜单关联
     * @return 部门和菜单关联集合
     */
    public List<DeptMenu> selectDeptMenuList(DeptMenu deptMenu);

    /**
     * 新增部门和菜单关联
     * 
     * @param deptMenu 部门和菜单关联
     * @return 结果
     */
    public int insertDeptMenu(DeptMenu deptMenu);

    /**
     * 修改部门和菜单关联
     * 
     * @param deptMenu 部门和菜单关联
     * @return 结果
     */
    public int updateDeptMenu(DeptMenu deptMenu);

    /**
     * 删除部门和菜单关联
     * 
     * @param deptId 部门和菜单关联ID
     * @return 结果
     */
    public int deleteDeptMenuById(Long deptId);

    /**
     * 批量删除部门和菜单关联
     * 
     * @param deptIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeptMenuByIds(String[] deptIds);

    /**
     * 批量新增部门菜单信息
     *
     * @param deptMenuList 部门菜单列表
     * @return 结果
     */
    public int batchDeptMenu(List<DeptMenu> deptMenuList);

    /**
     * 通过部门ID删除部门和菜单关联
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptMenuByDeptId(Long deptId);
}
