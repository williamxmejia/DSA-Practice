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
			last_node = self.head
			while last_node.next:
				last_node = last_node.next
			last_node.next = new_node
	
	def remove_middle(self, c):
		ll = LinkedList()
		dummy = ll

		node = self.head

		while node:
			if node.data != c:
				ll.append(node.data)
			node = node.next
		return dummy


	def print_list(self):
		node = self.head
		while node:
			print(node.data, end="->")
			node = node.next

if __name__ == "__main__":
	ll = LinkedList()
	ll.append("a")
	ll.append("b")
	ll.append("c")
	ll.append("d")
	ll.append("e")
	ll.append("f")

	ll.print_list()
	ll = ll.remove_middle("c")
	print('')
	ll.print_list()
