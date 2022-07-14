
def calcsum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum

numList = [10, 40, 60, 90]

result = calcsum(numList)

print("The sum  is: " + str(result))