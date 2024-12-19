def palindrome_permutation(str1, str2):
	str1 = str1.lower()
	str2 = str2.lower()

	map = {}
	for c in str1:
		if c == " ":
			continue
		if c in map:
			map[c] += 1
		else:
			map[c] = 1

	for c in str2:
		if c in map:
			map[c] -= 1
	
	print("permutations: '{}'".format(str2))
	return False if any(val >= 1 for val in map.values()) else True

print(palindrome_permutation("Tact Coa", "taco cat"))
