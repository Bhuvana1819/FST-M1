import pandas
data = { "Usernames" : ["admin","Charles","Deku" ],
        "Passwords" : ["password","Charl13","AllMight"] 
}
dataframe = pandas.DataFrame(data)
	
print(dataframe)
dataframe.to_csv("User details.csv", index=False)
print(dataframe["Usernames"])
print(dataframe["Usernames"][1],dataframe["Passwords"][1])
print(dataframe.sort_values("Usernames"))
print(dataframe.sort_values("Passwords",ascending=False))

