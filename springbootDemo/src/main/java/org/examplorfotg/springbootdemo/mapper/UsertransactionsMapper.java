package org.examplorfotg.springbootdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.examplorfotg.springbootdemo.entity.Usertransactions;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
@Mapper
public interface UsertransactionsMapper extends BaseMapper<Usertransactions> {
    IPage  Usertransactionspage(IPage<Usertransactions> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
