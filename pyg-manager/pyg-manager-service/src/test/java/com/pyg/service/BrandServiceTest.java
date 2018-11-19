package com.pyg.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pyg.manager.service.BrandService;
import com.pyg.pojo.TbBrand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BrandServiceTest {

    @Reference(timeout=10000000)
    private BrandService brandService;
    @Test
    public void test(){
        List<TbBrand> list = brandService.findAll();

    }
}
