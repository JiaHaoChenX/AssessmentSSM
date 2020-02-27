package com.chenjiahao.testssm.controller;


import com.chenjiahao.testssm.entity.Supplier;
import com.chenjiahao.testssm.service.ISupplierService;
import com.chenjiahao.testssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/SupplierController")
public class SupplierController {

    @Autowired
    ISupplierService dao;

    @RequestMapping("/selectAllSupplier")
    @ResponseBody
    public R selectAllCType() {
        R r = new R();
        List<Supplier> result = dao.selectAllSupplier();
        if (result.size() > 0) {
            return r.ok(result);
        }
        return r.error();
    }
}
