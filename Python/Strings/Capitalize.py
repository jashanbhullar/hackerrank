def capitalize(string):
	ans = ""
	i = 0;
	while i < len(string):
		ans += string[i].upper()
		i += 1
		while i < len(string) and ord(string[i]) > 64:
			ans += string[i]
			i += 1
		while i<len(string) and (ord(string[i]) == 32 or ord(string[i]) == 9):
			ans += string[i]
			i += 1
	return ans
string = input()
capitalized_string = capitalize(string)
print(capitalized_string)