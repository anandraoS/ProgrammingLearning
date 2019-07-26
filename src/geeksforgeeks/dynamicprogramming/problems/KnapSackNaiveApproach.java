package geeksforgeeks.dynamicprogramming.problems;

public class KnapSackNaiveApproach {
	public static void main(String args[]) {
		int val[] = { 60, 80, 100 };
		int wt[] = { 10, 20, 30 };
		int w = 50;
		int n = val.length;
		System.out.println(knapSack(w, wt, val, n));

	}

	static int knapSack(int w, int wt[], int val[], int n) {
		if (n == 0 || w == 0)
			return 0;
		if (wt[n - 1] > w)
			return knapSack(w, wt, val, n - 1);
		else
			return Integer.max(val[n - 1] + knapSack(w - wt[n - 1], wt, val, n - 1), knapSack(w, wt, val, n - 1));
	}
}
