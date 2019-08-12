def isHappy(n):
    old = []
    num =  str(n)

    while True:
        total = 0
        for char in num:
            total += int(char) * int(char)
        print(total)
        if total is not 1:
            num = str(total)
        else:
            return True
        if total not in old:
            old.append(total)
        else:
            return False
    
    return True
    
    # return True


print(isHappy(19))


