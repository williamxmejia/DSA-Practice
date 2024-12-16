class ListNode:
	def __init__(self, val):
		self.val = val
		self.next = None

class LinkedList:
	def __init__(self):
		self.head = None

	def append(self, data):
		new_node = ListNode(data)
		if not self.head:
			self.head = new_node
			return
		last_node = self.head
		while last_node.next:
			last_node = last_node.next
		last_node.next = new_node

	def print_list(self):
		current_node =  self.head

		while current_node:
			print(current_node.val, end=" -> ")
			current_node = current_node.next
		print("None")

l1 = LinkedList()
l1.append(1)
l1.append(2)
l1.append(3)
l1.print_list()

