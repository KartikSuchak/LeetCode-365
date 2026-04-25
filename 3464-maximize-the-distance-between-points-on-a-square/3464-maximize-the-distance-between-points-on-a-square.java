class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        long[] perimeterPos = new long[points.length];
        long sideLen = (long) side;

        for (int i = 0; i < points.length; i++) {
            long x = points[i][0];
            long y = points[i][1];

            if (x == 0) {
                perimeterPos[i] = y;
            } 
            else if (y == sideLen) {
                perimeterPos[i] = sideLen + x;
            } 
            else if (x == sideLen) {
                perimeterPos[i] = 3 * sideLen - y;
            } 
            else {
                perimeterPos[i] = 4 * sideLen - x;
            }
        }

        Arrays.sort(perimeterPos);

        int left = 1;
        int right = (int) ((4 * sideLen) / k) + 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if (canPlace(mid, perimeterPos, sideLen, k)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private boolean canPlace(int minDist, long[] perimeterPos, long sideLen, int k) {
        int totalPoints = perimeterPos.length;
        int[] chosenIndices = new int[k];
        long perimeter = 4 * sideLen;

        chosenIndices[0] = 0;
        long current = perimeterPos[0];

        for (int i = 1; i < k; i++) {
            int pos = Arrays.binarySearch(perimeterPos, current + minDist);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            if (pos == totalPoints) {
                return false;
            }
            chosenIndices[i] = pos;
            current = perimeterPos[pos];
        }

        if (perimeterPos[chosenIndices[k - 1]] - perimeterPos[0] <= perimeter - minDist) {
            return true;
        }

        for (chosenIndices[0] = 1; chosenIndices[0] < chosenIndices[1]; chosenIndices[0]++) {
            for (int j = 1; j < k; j++) {
                while (chosenIndices[j] < totalPoints &&
                       perimeterPos[chosenIndices[j]] < perimeterPos[chosenIndices[j - 1]] + minDist) {
                    chosenIndices[j]++;
                }
                if (chosenIndices[j] == totalPoints) {
                    return false;
                }
            }

            if (perimeterPos[chosenIndices[k - 1]] - perimeterPos[chosenIndices[0]] <= perimeter - minDist) {
                return true;
            }
        }

        return false;
    }
}