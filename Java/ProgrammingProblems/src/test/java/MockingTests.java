import org.example.Mocking;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingTests {
    @Mock
    User user;

    @Test
    @DisplayName("Permission assigned successfully")
    public void assignPermission() {
        Mocking mocking = new Mocking();
        mocking.setUser(user);
        when(user.getRole()).thenReturn("admin");
        when(user.getUsername()).thenReturn("shahriar");

        Assertions.assertEquals(1, mocking.assignPermission());
    }
}
