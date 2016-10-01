import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthy, ArrayList<String> cancer, String gene) {
		if (healthy.isEmpty())
			throw new IllegalArgumentException("healthySequences must contain at least one element");
		if (cancer.isEmpty())
			throw new IllegalArgumentException("cancerSequences must contain at least one element");
		for (int i = 0; i < gene.length() - 1; i++)
			if ("AGCT".indexOf(gene.substring(i, i + 1)) == -1)
				throw new IllegalArgumentException("candidate must contain only the letters A, C, G or T");
		for (String dna : healthy)
			for (int i = 0; i < dna.length() - 1; i++)
				if ("AGCT".indexOf(dna.substring(i, i + 1)) == -1)
					throw new IllegalArgumentException("healthySequence must contain only the letters A, C, G or T");
		for (String dna : cancer)
			for (int i = 0; i < dna.length() - 1; i++)
				if ("AGCT".indexOf(dna.substring(i, i + 1)) == -1)
					throw new IllegalArgumentException("healthySequence must contain only the letters A, C, G or T");

		int healthyCount = 0;
		int cancerCount = 0;

		for (String dna : healthy)
			if (dna.indexOf(gene) != -1)
				healthyCount++;
		for (String dna : cancer)
			if (dna.indexOf(gene) != -1)
				cancerCount++;

		double healthyPercent = (double) healthyCount / (double) healthy.size();
		double cancerPercent = (double) cancerCount / (double) cancer.size();

		if (cancerPercent > healthyPercent)
			return true;
		return false;
	}

	public int geneCount(ArrayList<String> sequence, String gene) {
		int geneCount = 0;
		for (String dna : sequence) {
			for (int i = 0; i < dna.length() - gene.length() + 1; i++) {
				if (gene.equals(dna.substring(i, i + gene.length())))
					geneCount++;
			}
		}
		return geneCount;
	}

}
