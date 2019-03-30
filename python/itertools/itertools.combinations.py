from itertools import combinations
string , n = input().split()
n = int(n)
string = sorted(string)
for i in range(1,n+1):
	ls = list(combinations(string,i))
	for ob in ls:
		print(''.join(map(str,ob)))	