package sda.springbootbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sda.springbootbank.dto.Account;
import sda.springbootbank.repositories.AccountsRepository;

import javax.websocket.server.PathParam;

/**
 * Created by Ryan Alexander on 22/11/2018.
 */
@RestController
// This handles what we used to do with XML and JSP servlet mapping
@RequestMapping(path = "/users")

public class AccountsController {
    @Autowired
    AccountsRepository accountsRepository;

    /* [incomplete] Complete this method to:
     a) iterate through all currencies, separate them
     b) total their balance amounts
     c) return them in a system.out.println or formatted HTML output
     */
    @RequestMapping(method = RequestMethod.GET, path = "/allByCurrency")
    public Iterable<Account> getAllUserByCurrency(@PathParam("currency") String currency) {
        return accountsRepository.findAllByCurrency(currency);
    }
}
