import pandas
dataframe = pandas.read_excel("Candidatedetails.xlsx",sheet_name="sheet1")
print(dataframe["Email"])
print (dataframe.sort_values("FirstName",ascending=False))
print(dataframe.shape)