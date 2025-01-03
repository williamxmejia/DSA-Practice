class Node:
	def __init__(self, data=None):
		self.data = data
		self.right = None
		self.left = None
	
	def print_tree(self):
		if self.left:
			self.left.print_tree()
		print(self.data)
		if self.right:
			self.right.print_tree()

def insert(root, data):
	queue = [root]
	while queue:
		current = queue.pop(0)

		if current.left is None:
			current.left = Node(data)
			return
		else:
			queue.append(current.left)

		if current.right is None:
			current.right = Node(data)
			return
		else:
			queue.append(current.right)

if __name__ == "__main__":
	root = Node(1)
	print(root.data)
	insert(root, 2)
	insert(root, 3)
	insert(root, 4)
	insert(root, 5)
	insert(root, 6)
	print(root.left.data)
	print(root.right.data)
	print(root.left.left.data)
	print(root.left.right.data)
	print(root.right.left.data)

	#root = Node(12)
	#root.left = Node(6)
	#root.left.left = Node(1)
	#root.left.right = Node(2)
	#root.right = Node(3)
	#root.right.left = Node(4)
	#root.right.right = Node(5)

	#print(root.data)
	#print(root.left.data)
	#print(root.right.data)
	#print(root.left.left.data)
	#print(root.left.right.data)
	#print(root.right.left.data)
	#print(root.right.right.data)
