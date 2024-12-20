def string_compression(str1):
	l = 0
	count = 1  
	ans = []
	for r in range(1, len(str1)):
		if str1[l] == str1[r]:
			count += 1
		else:
			ans.append(str1[l])
			ans.append(str(count))
			count = 1 
			l = r
			r += 1

	ans.append(str1[l])
	ans.append(str(count))
	return "".join(ans)

print(string_compression("aabcccccaaa"))
