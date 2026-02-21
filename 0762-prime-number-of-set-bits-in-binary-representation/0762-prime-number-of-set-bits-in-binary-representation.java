class Solution {
  public int countPrimeSetBits(int left, int right) {
    final int magic = 665772;
    int ans = 0;

    for (int num = left; num <= right; ++num)
      if ((magic >> Integer.bitCount(num) & 1) == 1)
        ++ans;

    return ans;
  }
}