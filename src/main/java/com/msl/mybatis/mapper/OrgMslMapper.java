package com.msl.mybatis.mapper;

import com.msl.mybatis.entity.OrgMsl;
import java.util.List;

public interface OrgMslMapper {
    int insert(OrgMsl record);

    List<OrgMsl> selectAll();
}