import matplotlib.pyplot as plt
import numpy as np

f = open("output.txt", "r")
nums = []
xValue = []
yValue = []


for line in f:
    placeHold = ""

    for char in line:
        placeHold += char
    
    nums.append(float(placeHold))

i = 0
for x in nums:

    if i % 2 == 0:
        xValue.append(x)

    else:
        yValue.append(x)

    i += 1

plt.plot(np.array(xValue), np.array(yValue))

plt.show()