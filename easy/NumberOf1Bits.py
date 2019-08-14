
def numBits(num):
    total = 0
    for i in range(32):
        total += (n & (1 << i)) >> i
    return total;

num = 2*31
print(numBits(num))