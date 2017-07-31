import itertools
n = int(input())
ls = list(map(str , input().split(' ')))
count = ls.count('a')
k = int(input())
a = len(list(itertools.combinations(ls,k)))
for _ in range(count): 
	ls.remove('a')
b = len(list(itertools.combinations(ls,k)))
#print(a,b)
ans = (a-b)/a
print(ans)