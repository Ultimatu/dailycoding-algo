def isUnDecrease(list: list) -> bool:
    for i in range(1, len(list)):
        if list[i] < list[i - 1]:
            return False
    return True




