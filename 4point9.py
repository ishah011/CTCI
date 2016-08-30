def findNode(node, value):
	if(node == None):
		return
	elif(node.value == value):
		print node
		findNode(node.right, value)
		findNode(node.left, value)
	elif(node.value > value):
		findNode(node.right, value)
		findNode(node.left, value)
	else:
		integ []
		traverseTree(node, value, track, integ)
		track = 0

def traverseTree(node, value, track, integ):
	if(track == value):
		print integ
		return
	if(track > value):
		return
	if(track < value):
		track = node.value + track
		integ.append(node)
		traverseTree(node.left, value, track, integ)
		traverseTree(node.right, value, track, integ)
