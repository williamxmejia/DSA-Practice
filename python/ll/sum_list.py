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
		else:
			last_node = self.head
			while last_node.next:
				last_node = last_node.next
			last_node.next = new_node
	
	def reverse(self):
		head = self.head
		prev = None
		
		while head:
			nxt = head.next
			head.next = prev
			prev = head
			head = nxt
			#prev = prev.next
		
		return prev
		

	def print_list(self):
		head = self.head
		while head:
			print(head.data, end="->")
			head = head.next

if __name__ == "__main__":
	ll1 = LinkedList()
	ll2 = LinkedList()
	ll1.append(7)
	ll1.append(1)
	ll1.append(6)
	ll1.reverse()
	print()
	ll1.print_list()
