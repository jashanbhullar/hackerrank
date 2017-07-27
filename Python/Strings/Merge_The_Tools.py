def merge_the_tools(string, k):
	i = 0
	while i<len(string):
		val = string[i:i+k]
		ans = ""
		for c in val:
			if ans.find(c) == -1:
				ans += c
		print(ans)
		i += k


string , k = input(), int(input())
merge_the_tools(string,k)