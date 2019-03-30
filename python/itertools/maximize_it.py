from itertools import product
n , m = map(int,input().split())
ls = []
for i in range(n):
	ob = list(map(int,input().split()))
	ls.append(ob[1:])

ls = list(product(*ls))

def fun(ob):
	return sum( x*x for x in ob) % m
print(max ( list ( map ( fun , ls))))