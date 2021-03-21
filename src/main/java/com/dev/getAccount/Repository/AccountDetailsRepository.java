package com.dev.getAccount.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dev.getAccount.entity.AccountDetails;

@Repository
public interface AccountDetailsRepository extends MongoRepository<AccountDetails, Integer>{

}
