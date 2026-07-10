class Solution {
public:
    int trap(vector<int>& height) {

        int left = 0;
        int right = height.size() - 1;

        int Lmax = 0;
        int Rmax = 0;

        int ans = 0;

        while (left < right) {

            if (height[left] <= height[right]) {

                if (height[left] >= Lmax)
                    Lmax = height[left];
                else
                    ans += Lmax - height[left];

                left++;

            } else {

                if (height[right] >= Rmax)
                    Rmax = height[right];
                else
                    ans += Rmax - height[right];

                right--;
            }
        }

        return ans;
    }
};