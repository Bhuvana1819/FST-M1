import pandas
dataframe = pandas.read_csv('employees.csv')
print(dataframe)
import pandas
dataframe = pandas.read_csv('employees.csv')
print(dataframe["Name"][2])
# import pandas
import pandas

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe1 = pandas.DataFrame(data)

# Write the data to a csv file
dataframe1.to_csv("vehicles.csv")
print(dataframe1)
