Dict = {"Apple":"50 Rs","Orange": "70 Rs","Chikoo":"40 rs"}
print(Dict)
Fruitrequired = input ("What do you want ")
if (Fruitrequired in Dict):
    print("Available")
else:
    print("Not available")