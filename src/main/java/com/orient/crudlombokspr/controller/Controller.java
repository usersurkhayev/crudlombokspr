package com.orient.crudlombokspr.controller;

import com.orient.crudlombokspr.entity.Account;
import com.orient.crudlombokspr.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "accounts")
public class Controller {

    @Autowired
    AccountService accountService;




    @GetMapping("/all")
    public List<Account> getAllAcc() {

        List<Account> accounts = accountService.getAllAcc();

        return accounts;
    }





    @GetMapping("/{id}")
    public Account getAccById(@PathVariable Long id) {

        Account account = accountService.getAccById(id);

        return account;
    }





    @PostMapping("/create")
    public void create(@RequestBody Account account){

         accountService.create(account);

    }




    @PutMapping("/update")
    public void update(@PathVariable Long id,@RequestBody Account account){

        accountService.update(id,account);

    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){

        accountService.delete(id);

    }


}