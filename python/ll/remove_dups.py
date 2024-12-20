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

		last_node = self.head
		while last_node.next:
			last_node = last_node.next
		last_node.next = new_node
	
	def remove_duplicates(self):
		node = self.head
		arr = []
		ll = LinkedList()

		while node:
			if not node.data in arr:
				#print(node.data)
				ll.append(node.data)
				arr.append(node.data)
			#print(node.data)
			node = node.next
		return ll
		
	def print_list(self):
		node = self.head
		while node:
			print(node.data, end="->")
			node = node.next

if __name__ == "__main__":
	arr = [4,2,3,2,4,5,5,2,1]
	ll = LinkedList()

	for i in arr:
		ll.append(i)

	ll.print_list()
	ll = ll.remove_duplicates();
	print("")
	ll.print_list()

