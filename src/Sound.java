
public class Sound {
	private int[] samples;

	public Sound(int[] samples) {
		this.samples = samples;
	}

	public int[] getSamples() {
		return samples;
	}

	public int limitAmplitude(int limit) {
		int numChanges = 0;
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] > limit) {
				numChanges++;
				samples[i] = limit;
			} else if (samples[i] < -limit) {
				numChanges++;
				samples[i] = -limit;
			}
		}
		return numChanges;
	}

	public void trimSilenceFromBeginning() {
		if (samples.length > 0) {
			int numZeros = 0;
			while (samples[numZeros] == 0 && numZeros < (samples.length - 1)) {
				numZeros++;
			}
			if (numZeros >= samples.length) {
				samples = new int[] {};
			} else {
				int[] trim = new int[samples.length - numZeros+1];
				for (int i = 0; i < trim.length; i++) {
					trim[i] = samples[i + numZeros];
				}
				samples = trim;
				for (int i = 0; i < samples.length; i++) {
					System.out.print(samples[i] + " ");
				}
			}
		}

	}

}
