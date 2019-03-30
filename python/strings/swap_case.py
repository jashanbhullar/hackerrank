def swap_case(s):
	res = ""
	for x in s:
		val = ord(x)
		if val > 64 and val < 91:
			res += chr(val+32)
		elif val > 96 and val < 123:
			res += chr(val-32)
		else:
			res += x
	return res

#print(swap(input()))