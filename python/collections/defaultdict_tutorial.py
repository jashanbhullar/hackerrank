from collections import defaultdict
d = defaultdict(list)
n , m = map(int , input().split())
for i in range(n):
	d[input()].append(i+1)
for i in range(m):
	ob = d[input()]
	if len(ob) != 0:
		print(' '.join(map(str,ob)))
	else:
		print('-1')