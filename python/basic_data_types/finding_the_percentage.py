n = int(input())

stu = {}
for x in range (0,n):
	data = input().split()
	name = data[0]
	li = [float(i) for i in data[1:]]
	stu[name] = li
res = 0
for x in stu[input()]:
	res += x
res = res/3
print('%.2f' % res)