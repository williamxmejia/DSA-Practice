class Node:
	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList:
	def __init__(self):
		self.head = None

	def append(self, data):
		new_node = Node(data)

		if self.head is None:
			self.head = new_node
			return
		else:
			node = self.head
			while node.next:
				node = node.next
			node.next = new_node
	
	def kth_to_last(self, index):
		counter = 0
		node = self.head

		while node:
			if counter >= index:
				print(node.data, end="->")
			counter += 1
			node = node.next

	def print_list(self):
		node = self.head
		while node:
			print(node.data, end="->")
			node = node.next


ll = LinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)

#ll.print_list()
ll.kth_to_last(2)
