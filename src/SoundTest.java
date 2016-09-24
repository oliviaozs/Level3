import static org.junit.Assert.*;

import org.junit.Test;

public class SoundTest {

	@Test
	public void testLimitAmplitude() {
		Sound s = new Sound(new int[]{40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223});
		assertEquals(5, s.limitAmplitude(2000));
		Sound s2 = new Sound(new int[]{});
		assertEquals(0,s2.limitAmplitude(2000));
		Sound s3 = new Sound(new int[]{0, 8, 44, 6, 700, 396});
		assertEquals(0, s3.limitAmplitude(2000));
		Sound s4 = new Sound(new int[]{2001, -3009, 4500});
		assertEquals(3, s4.limitAmplitude(2000));
	}
	
	@Test
	public void testTrimSilenceFromBeginning() {
		Sound s = new Sound(new int[]{0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0});
		s.trimSilenceFromBeginning();
		assertArrayEquals(new int[]{-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0}, s.getSamples());
		Sound s2 = new Sound(new int[]{0, 0, 0, 0, 0});
		s2.trimSilenceFromBeginning();
		assertArrayEquals(new int[]{}, s.getSamples());
		Sound s3 = new Sound(new int[]{1, 5, -34, 6});
		s3.trimSilenceFromBeginning();
		assertArrayEquals(new int[]{1, 5, -34, 6}, s3.getSamples());
		Sound s4 = new Sound(new int[]{});
		s4.trimSilenceFromBeginning();
		assertArrayEquals(new int[]{}, s4.getSamples());
	}

}
