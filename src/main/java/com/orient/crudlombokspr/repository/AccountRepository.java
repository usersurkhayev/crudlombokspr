package com.orient.crudlombokspr.repository;

import com.orient.crudlombokspr.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}