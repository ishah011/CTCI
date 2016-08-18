def isBST(root):
	if(!subroot.left and !subroot.right):
		return true
	elif((subroot.left > subroot) or (subroot.right < subroot)):
		return false
	else:
		return (isBST(subroot.left) and isBST(subroot.right))