#
#1.3: Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
#NOTE: one or two additional variables are fine. An extra copy of the array is not.
#

myString = "hubba bubba bubble tape"

noDuplicates = []
for letter in myString:
    if letter not in noDuplicates:
        noDuplicates.append(letter)
myString = ''.join(noDuplicates)
print myString
