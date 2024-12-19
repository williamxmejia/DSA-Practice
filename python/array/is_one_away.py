def is_one_away(str1, str2):
	if len(str1) - len(str2) > 1 or len(str2) - len(str2) > 1:
		return False
	
	if len(str1) == len(str2):
		count = 0
		for i in range(len(str1)):
			if count > 1:
				return False
			if str1[i] != str2:
				count += 1
			return count == 1
	else:
		if len(str1) > len(str2):
			i = 0
			j = 0
			count = 0
			while i < len(str1) and j < len(str2):
				if str1[i] != str2[j]:
					count += 1
					if len(str1) > len(str2):
						i += 1
					else:
						j += 1
				else:
					i += 1
					j += 1

			return count == 1

print(is_one_away("pale", "bake"))
