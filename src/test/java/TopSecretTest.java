import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class TopSecretTest {

    @Test
    void start_delegatesToControllerRun() {
        ProgramController controller = mock(ProgramController.class);
        TopSecret app = new TopSecret(controller);

        String[] args = {"01"};

        app.start(args);

        verify(controller).run(args);
    }
}