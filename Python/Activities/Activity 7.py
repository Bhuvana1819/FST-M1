#numbers = [1,2,3,4,5,6,7,8]
numbers = list(input("Enter nos").split(","))
y=0
for number in numbers:
    y+=int(number)
print(y)

