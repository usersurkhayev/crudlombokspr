package com.orient.crudlombokspr.service;

import com.orient.crudlombokspr.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<Account>  getAllAcc();
    Account getAccById(Long id);

    void create(Account account);
    void update(Long id,Account account);
    void delete(Long id);



}
