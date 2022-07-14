def recurssion(num):
    if num:
        return num + recurssion(num-1)
    else:
        return 0
res = recurssion(10)
print(res)