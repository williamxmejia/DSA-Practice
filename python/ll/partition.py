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
			node = self.head
			while node.next:
				node = node.next
			node.next = new_node
	
	def partition(self, val):
		dummy_right = Node(0)
		dummy_left = Node(0)
		right = dummy_right
		left = dummy_left

		head = self.head
		while head:
			if head.data < val:
				left.next = head
				left = left.next
			else:
				right.next = head
				right = right.next
			head = head.next

		right.next = None
		left.next = dummy_right.next

		return dummy_left.next
		
	
	def print_list(ll):
		node = ll.head

		while node:
			print(node.data, end="->")
			node = node.next

if __name__ == "__main__":
	arr = [3,5,8,5,10,2,1]
	ll = LinkedList()

	for num in arr:
		ll.append(num)

	#ll.print_list()
	ll.partition(5)
	ll.print_list()







