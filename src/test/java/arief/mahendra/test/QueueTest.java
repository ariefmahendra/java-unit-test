package arief.mahendra.test;


import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("Queue Test")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("When new queue is created")
    class WhenNewQueueIsCreated {
        @BeforeEach
        @DisplayName("set up")
        public void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer, size must be 1")
        void offerNewData() {
            queue.offer("eko");
            Assertions.assertEquals(1, queue.size());
        }
    }
}
