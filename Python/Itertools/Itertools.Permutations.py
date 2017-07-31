from itertools import permutations
string , n = input().split()
n = int(n)
string = sorted(string)
ls = list(permutations(string,n))
for i in ls:
	print(''.join(map(str,i)))
