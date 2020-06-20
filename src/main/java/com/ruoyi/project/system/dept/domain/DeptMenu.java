package com.ruoyi.project.system.dept.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 部门和菜单关联对象 sys_dept_menu
 * 
 * @author zhaopengcheng
 * @date 2020-04-22
 */
public class DeptMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色ID */
    private Long deptId;

    /** 菜单ID */
    private Long menuId;

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setMenuId(Long menuId) 
    {
        this.menuId = menuId;
    }

    public Long getMenuId() 
    {
        return menuId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deptId", getDeptId())
            .append("menuId", getMenuId())
            .toString();
    }
}
