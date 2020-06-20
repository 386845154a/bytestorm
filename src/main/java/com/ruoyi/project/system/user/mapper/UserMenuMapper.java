package com.ruoyi.project.system.user.mapper;

import com.ruoyi.project.system.user.domain.UserMenu;

import java.util.List;

/**
 * 用户和菜单关联（后期根据用户来控制权限）Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-26
 */
public interface UserMenuMapper 
{
    /**
     * 查询用户和菜单关联（后期根据用户来控制权限）
     * 
     * @param userId 用户和菜单关联（后期根据用户来控制权限）ID
     * @return 用户和菜单关联（后期根据用户来控制权限）
     */
    public UserMenu selectUserMenuById(Long userId);

    /**
     * 查询用户和菜单关联（后期根据用户来控制权限）列表
     * 
     * @param userMenu 用户和菜单关联（后期根据用户来控制权限）
     * @return 用户和菜单关联（后期根据用户来控制权限）集合
     */
    public List<UserMenu> selectUserMenuList(UserMenu userMenu);

    /**
     * 新增用户和菜单关联（后期根据用户来控制权限）
     * 
     * @param userMenu 用户和菜单关联（后期根据用户来控制权限）
     * @return 结果
     */
    public int insertUserMenu(UserMenu userMenu);

    /**
     * 修改用户和菜单关联（后期根据用户来控制权限）
     * 
     * @param userMenu 用户和菜单关联（后期根据用户来控制权限）
     * @return 结果
     */
    public int updateUserMenu(UserMenu userMenu);

    /**
     * 删除用户和菜单关联（后期根据用户来控制权限）
     * 
     * @param userId 用户和菜单关联（后期根据用户来控制权限）ID
     * @return 结果
     */
    public int deleteUserMenuById(Long userId);

    /**
     * 批量删除用户和菜单关联（后期根据用户来控制权限）
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserMenuByIds(String[] userIds);

    /**
     * 批量添加user 和 menu 的关联
     *
     * @param list UserMenu集合
     * @return 结果
     */
    public int batchUserMenu(List<UserMenu> list);
}
