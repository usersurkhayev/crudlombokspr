package com.orient.crudlombokspr.service.Impl;

import com.orient.crudlombokspr.entity.Account;
import com.orient.crudlombokspr.repository.AccountRepository;
import com.orient.crudlombokspr.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;






    @Override
    public List<Account> getAllAcc() {

        List<Account> accounts = accountRepository.findAll();

        return accounts;
    }







    @Override
    public Account getAccById(Long id) {

        Account account = accountRepository.findById(id).get();

        return account;
    }








    @Override
    public void create(Account account) {

        accountRepository.save(account);
    }









    @Override
    public void update(Long id,Account account) {

        Account oldaccount = getAccById(id);

        oldaccount.setUsername(account.getUsername());
        oldaccount.setPassword(account.getPassword());
        oldaccount.setFirstname(account.getFirstname());
        oldaccount.setLastname(account.getLastname());
        oldaccount.setEmail(account.getEmail());

        accountRepository.save(oldaccount);

    }








    @Override
    public void delete(Long id) {

        accountRepository.deleteById(id);
    }
}
