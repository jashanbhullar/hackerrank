from collections import Counter
n = int(input())
shoes = Counter(list(map(int, input().split())))
res = 0
for i in range(int(input())):
	size , cost = map(int , input().split())
	if shoes[size] != 0:
		res += cost
		shoes[size] -=1
print(res) 