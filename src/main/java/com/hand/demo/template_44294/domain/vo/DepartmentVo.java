package com.hand.demo.template_44294.domain.vo;

import com.hand.demo.template_44294.domain.entity.Employees;
import lombok.Data;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:08
 */
@Data
public class DepartmentVo {
    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 员工集合
     */
    private List<Employees> employeesList;
}
