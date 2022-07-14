list1 = [1,2,3,11,12,13,14,15]
list2 = [4,5,6,7,8,9,10,16,17]
list3=[]

for number in list1:
    if (number%2) > 0:
        list3.append(number)
for number in list2:
    if (number%2) == 0:
        list3.append(number)
print(list3)