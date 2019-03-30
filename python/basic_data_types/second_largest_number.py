n = int(input())
ar = map(int, input().split())

li = list(ar)
li.sort()
li.reverse()
for x in li:
	if x != li[0]:
		print(x)
		break
