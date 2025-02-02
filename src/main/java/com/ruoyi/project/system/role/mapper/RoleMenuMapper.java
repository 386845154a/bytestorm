package com.ruoyi.project.system.role.mapper;

import java.util.HashSet;
import java.util.List;
import com.ruoyi.project.system.role.domain.RoleMenu;
import io.swagger.models.auth.In;

/**
 * 角色与菜单关联表 数据层
 * 
 * @author ruoyi
 */
public interface RoleMenuMapper
{
    /**
     * 通过角色ID删除角色和菜单关联
     * 
     * @return 结果
     */
    default int deleteRoleMenuByRoleId() {
        return deleteRoleMenuByRoleId();
    }

    /**
     * 通过角色ID删除角色和菜单关联
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteRoleMenuByRoleId(Long roleId);
    
    /**
     * 批量删除角色菜单关联信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleMenu(Long[] ids);
    
    /**
     * 查询菜单使用数量
     * 
     * @param menuId 菜单ID
     * @return 结果
     */
    public int selectCountRoleMenuByMenuId(Long menuId);
    
    /**
     * 批量新增角色菜单信息
     * 
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
    public int batchRoleMenu(List<RoleMenu> roleMenuList);

    /**
     * 根据用户拥有的角色id查询出所具有的的菜单权限id
     *
     * @param roleIds 角色ids
     * @return 结果
     */
    public HashSet<Long> selectMenuByRoleId(Long[] roleIds);
}
