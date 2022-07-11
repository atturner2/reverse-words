import static org.junit.Assert.*;
import reverseWords;

import org.junit.Test;

public class reverseWordsTest {

	reverseWords reverse = new reverseWords();
	@Test
	public void initialTest() {
		
		assertEquals("s'tel tae, amdnarg", reverse.reverse("let's eat, grandma"));
	}
	@Test
	public void helloWorld() {
		
		assertEquals("olleh dlrow", reverse.reverse("hello world"));
	}
	@Test
	public void backwards() {
		
		assertEquals("sdrawkcab", reverse.reverse("backwards"));
	}
	@Test
	public void quickfox() {
		
		assertEquals("ehT kciuq nworb xof spmuj revo eht yzal god", reverse.reverse("The quick brown fox jumps over the lazy dog"));
	}
	@Test
	public void semicolon() {
		assertEquals("olleh; siht ecnetnes sah a nolocimes", reverse.reverse("hello; this sentence has a semicolon"));
	}

}
