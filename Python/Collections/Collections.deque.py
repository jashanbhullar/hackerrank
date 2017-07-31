from collections import deque
d = deque()
for i in range(int(input())):
	cm = input()
	try:
		op , val = cm.strip().split()
	except ValueError:
		op = cm
		val = ''
	eval('d.'+op+'('+val+')')
print(*d)