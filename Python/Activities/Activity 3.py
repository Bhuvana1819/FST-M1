Player1 = str (input("Enter player1 Name : "))
Player2 = str (input("Enter player2 Name : "))
Player1Choice = str(input (Player1 + " Make your choice : "))
Player2Choice = str(input (Player2 + " Make your choice : "))
if Player1Choice == Player2Choice:
    print("Tie")
elif Player1Choice == "Stone":
    if Player2Choice == "Scissor": 
        print ("Stone Wins")
    else:
        print("Paper Wins")
elif Player1Choice == "Scissor":
    if Player2Choice == "Paper": 
        print ("Scissor Wins")
    else:
        print("Stone Wins")
elif Player1Choice == "Paper": 
    if Player2Choice == "Stone": 
        print ("Paper Wins")
    else:
        print("Scissor Wins")
else: print("invalid input")