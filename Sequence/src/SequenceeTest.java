import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequenceeTest {

	@Test
	void test() {
		Sequencee.writeSequence(44);
	
		
		equals(Sequencee.writeSequence(10));
		equals(Sequencee.writeSequence(7));
		equals(Sequencee.writeSequence(4));
		
	}

}
