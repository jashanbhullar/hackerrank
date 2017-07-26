def count_substring(string, sub_string):
	ans = 0
	index = 0
	for i in range (0,len(string)):
		val = string.find(sub_string,index,len(string))
		if val != -1 :
			ans += 1
			index = val+1
		else:
			break
	return ans

string = input().strip()
sub_string = input().strip()

count = count_substring(string, sub_string)
print(count)