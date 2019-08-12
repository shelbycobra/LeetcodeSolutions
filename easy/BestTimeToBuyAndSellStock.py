import sys

def highestProfit(prices):
    lowest = sys.maxsize;
    maxProfit = 0;

    for x in range(0, len(prices)):
        if prices[x] <= lowest:
            lowest = prices[x]
        if (prices[x] - lowest) > maxProfit:
            maxProfit = prices[x]-lowest
    
    return maxProfit;

print(highestProfit([7,1,5,3,6,4]))

