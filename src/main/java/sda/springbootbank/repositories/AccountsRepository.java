package sda.springbootbank.repositories;

import org.springframework.data.repository.CrudRepository;
import sda.springbootbank.dto.Account;


/**
 * Created by Ryan Alexander on 22/11/2018.
 */
// this is a Bean because it extends CrudRepository
public interface AccountsRepository extends CrudRepository<Account, Integer>{
    Iterable<Account> findAllByCurrency(String currency);
}