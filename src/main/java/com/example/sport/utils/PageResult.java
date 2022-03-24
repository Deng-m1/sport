package com.example.sport.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends Result{
    private long total;
    private List<T> list;

    public PageResult(long total,List<T> list)
    {
        this.setFlag(true);
        this.setMsg("分页查询成功");
        this.total=total;
        this.list=list;
    }
}
