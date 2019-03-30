n , m = map(int , input().split())
ls = []
for _ in range(m):
	x = tuple(map(float ,input().split()))
	ls.append(x)

for i in zip(*ls):
	print(sum(i)/m)