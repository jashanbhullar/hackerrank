from collections import deque
for i in range(int(input())):
	n = int(input())
	d = deque(map(int,input().strip().split()))
	ans = 'Yes'
	curr = 2**31
	while len(d) > 0:
		if d[0] > d[-1]:
			if d[0] > curr :
				ans='No'
				break
			curr = d.popleft()
		else:
			if d[-1] > curr :
				ans = 'No'
				break
			curr = d.pop()
	print(ans)
