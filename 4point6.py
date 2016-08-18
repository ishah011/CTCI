class Tree:
    def __init__(self, dat, left=None, right=None):
        self.left = left
        self.right = right
        self.data = dat

# Puts the nodes in order in a list
def findNext(node, array):
	if(node.right == None and node.left == None):
		array.append(node.data)
		return
	elif((node.left == None and node.right!= None)):
		array.append(node.data)
		findNext(node.right, array)
	elif((node.right == None and node.left != None)):
		findNext(node.left, array)	
	else:
		findNext(node.left, array)
		array.append(node.data)
		findNext(node.right, array)

#create a new tree
left_right = Tree(0)
left = Tree(1,None,left_right)
right_left = Tree(5)
right_right = Tree(4)
right = Tree(3,right_left, right_right)
tree = Tree(2, left, right)

dataList = []

findNext(tree, dataList)
current = right
nextOne = False

#goes through the list and finds the next node
for i in dataList:
	if i == current.data:
		nextOne = True
	elif nextOne == True:
		print i
		nextOne = False



