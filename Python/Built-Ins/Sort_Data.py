n , m = map(int , input().split())
ls = []
for _ in range(n):
	ls.append(list(map(int,input().split())))
index = int(input())
def getKey(item):
	return item[index]
ls = sorted(ls,key = getKey)
for i in ls:
	print(*i)