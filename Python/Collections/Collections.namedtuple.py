from collections import namedtuple
n = int(input())
S = namedtuple('Student', ' '.join(map(str,input().split())))
marks = 0
for i in range(n):
	a , b , c , d =  map(str,input().split())
	ob = S(a,b,c,d)
	marks += int(ob.MARKS)
print(marks/n)