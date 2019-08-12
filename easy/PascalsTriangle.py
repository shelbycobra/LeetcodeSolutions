def generate(numRows):
    triangle = []
    for x in range(0, numRows):
        triangle.append([])
        triangle[x].append(1)

        if (x > 1):
            y = 1
            while y < len(triangle[x - 1]):
                triangle[x].append(triangle[x - 1][y-1] + triangle[x-1][y])
                y += 1
        if (x > 0):
            triangle[x].append(1)

    return triangle

print(generate(5))