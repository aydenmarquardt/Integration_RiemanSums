import matplotlib as plt

f = open("output.txt", "r")
nums = []

for line in f:
    for char in line:
        
        if(char != ","):
            number = char

