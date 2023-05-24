package com.example.labreservesystem.mapper;

import com.example.labreservesystem.bean.po.Department;
import com.example.labreservesystem.bean.po.LabManager;
import com.example.labreservesystem.bean.po.Semester;
import com.example.labreservesystem.bean.po.Student;
import com.example.labreservesystem.bean.vo.PageUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysManagerMapper {
    List<Student> getStudentByNum(String stu_num);

//    获取全部管理员信息
    List<LabManager> getLabManagerList(@Param("pageUtils")PageUtils pageUtils);
//    获取管理员信息数量
    Integer getLabManagerListCount();
//    删除管理员ById
    Boolean deleteLabManagerById(String manager_id);
//获取学院
    List<Department> getDepartmentList(@Param("pageUtils")PageUtils pageUtils);
//    获取学院数
    Integer getDepartmentListCount();
//    更新学院
    Boolean updateDepartment(@Param("department")Department department);
//    根据id删除学院
    Boolean deleteDepartmentById(String dept_id);
//    增加学院
    Boolean addDepartment(@Param("department") Department department);
//    获取学期
    Semester getSemester();
//    更新学期
    Boolean updateSemester(@Param("semester")Semester semester);
//    删除学期
    Boolean deleteSemesterById(String semester_id);
}
