package store.account;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AccountResource implements AccountController {

    @Override
    public ResponseEntity<Void> create(AccountIn in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<List<AccountOut>> findAll() {
        return ResponseEntity
            .ok(List.of(
                AccountOut.builder().name("1berto").build(),
                AccountOut.builder().name("2berto").build()
            ));
    }

    @Override
    public ResponseEntity<Void> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity<Void> healthCheck() {
        return ResponseEntity
            .ok()
            .build();
    }

    @Override
    public ResponseEntity<AccountOut> findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
