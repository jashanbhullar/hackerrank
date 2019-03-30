n = int(input())

stu = []
for x in range (0,n):
	name = input()
	score = float(input())
	li = [score,name]
	stu.append(li)
stu.sort()
sc = stu[0][0];
for x in stu:
	if x[0] != sc:
		sc = x[0]
		break;
for x in stu:
	if x[0] == sc:
		print(x[1])
	elif x[0] > sc:
		break