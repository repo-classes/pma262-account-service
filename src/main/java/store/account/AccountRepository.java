package store.account;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountModel, String> {

    List<AccountModel> findAll();

    // Implementa JPQL
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    Optional<AccountModel> findByEmailAndHashPassword(
        String email,
        String hashPassword
    );
    
}
