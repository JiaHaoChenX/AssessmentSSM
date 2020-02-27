package com.chenjiahao.testssm.service;


import com.chenjiahao.testssm.dao.ISupplier;
import com.chenjiahao.testssm.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    ISupplier service;


    @Override
    public List<Supplier> selectAllSupplier() {
        return service.selectAllSupplier();
    }
}
