package sda.springbootbank.repositories;

import org.springframework.data.repository.CrudRepository;
import sda.springbootbank.dto.User;

/**
 * Created by Ryan Alexander on 22/11/2018.
 */

// this is a Bean because it extends CrudRepository
public interface UserRepository extends CrudRepository<User, Integer> {

    /* new request query. Spring parses 'findAllByName',
    name is property of user. Spring creates the SQL query from this line.
     */
    Iterable<User> findAllByName(String name);

    // filter by Nationality
    Iterable<User> findAllByNationality(String nationality);

}