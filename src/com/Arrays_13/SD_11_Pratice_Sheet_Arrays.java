package com.Arrays_13;

public class SD_11_Pratice_Sheet_Arrays {
    public static boolean containsDuplicate(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int BuyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int TrappedRainWater(int height[]) {
        int n = height.length;
        // Calculate left max boundary - Auxiliary array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], height[i - 1]);
        }

        // Calculate right max boundary - Auxiliary array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            rightmax[i] = Math.max(height[i], height[i + 1]);
        }
        int TrappedWater = 0;
        // Loop
        for (int i = 0; i < n; i++) {
            // Waterlevel = min(leftmax boundary, rightmax boundary)
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);

            // Trapped water = waterLevel - height[i]
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        /*// Question 1
        int numbers[] = {1, 2, 3, 1};
        // int numbers[] = {1, 2, 3, 4};
        // int numbers[] = {1, 1, 1, 3, 3,4 ,3, 2, 4, 2};
        System.out.println("The numbers is appears atleast twice: " + containsDuplicate(numbers));*/

        /*// Question 3
        int prices[] = {7, 1, 5, 3, 6, 4}; // Time complexity is = O(n)
        // int prices[] = {7, 6, 4, 3, 1};
        System.out.println(BuyAndSellStocks(prices));*/

        // Question 4
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrappedRainWater(height));

    }
}
