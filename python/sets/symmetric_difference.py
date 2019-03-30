def fun(a,b):
	ar = set()
	for i in a.difference(b):
		ar.add(i)
	for i in b.difference(a):
		ar.add(i)
	for i in sorted(ar):
		print(i)
n = input()
N = set(map(int,input().split(' ')))
m = input()
M = set(map(int,input().split(' ')))
fun(N,M)