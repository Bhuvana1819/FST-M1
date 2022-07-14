def fibonacci(a):
    if a <= 1:
        return a
    else:
	    return(fibonacci(a-1) + fibonacci(a-2))
no = int(input("Pl enter your no"))
for i in range(no):
    print(fibonacci(i)) 