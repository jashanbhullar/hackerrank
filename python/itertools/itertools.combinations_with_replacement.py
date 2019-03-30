from itertools import combinations_with_replacement
string , n = input().split()
n = int(n)
string = sorted(string)
ls = list(combinations_with_replacement(string,n))
for i in ls:
	print(''.join(map(str,i)))
