#
# 4.5
# Implement a function to check if a binary tree is a binary search tree
#

class Tree:
    def __init__(self, dat, left=None, right=None):
        self.left = left
        self.right = right
        self.data = dat

def isBST(root, answer):
	
	# check if the left and/or right nodes exist and if they are not in the BST format
	if(root.left != None and root.left.data > root.data):
		answer = False
		return answer
	elif(root.right != None and root.right.data < root.data):
		answer = False
		return answer
	
	# otherwise, if we are at the end and have not returned false yet, return true
	elif(root.left == None and root.right == None):
		return answer
	elif(root.left == None):
		return answer
	elif(root.right == None):
		return answer
	
	# recursively call isBST and return the ANDed values of the results
	else:
		return (isBST(root.left, answer) and isBST(root.right, answer))


# create a new tree
#         2
#		/	\
#	  1       3
#		\       \
#		  0       4
#
left_right = Tree(0)
left = Tree(1, None, left_right)
right_right = Tree(4)
right = Tree(3, None, right_right)
tree = Tree(2, left, right)
answer = True

# returns false with the above tree
print isBST(tree, answer)

