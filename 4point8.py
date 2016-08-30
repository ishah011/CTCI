def TreeCheck(r1, r2):
	if(r2 == None):
		return True
	return subTree(r1, r2)

def subTree(r1, r2):
	if(r1 == None):
		return False
	if(r1.data == r2.data):
		return checkSub(r1, r2)
	return (subTree(r1.left, r2) or subTree(r1.right, r2))

def checkSub(r1, r2):
	if(r1==None and r2==None):
		return True
	elif(r1.data!=r2.data):
		return False
	elif(r1 == None or r2 == None):
		return False
	return (checkSub(r1.right, r2.right) and checkSub(r1.left, r2.left))