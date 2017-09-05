from statistics import median
n = int(input())
ls = []
for i in [[x]*y for x,y in zip(list(map(int,input().split())), list(map(int,input().split())))]:
	ls += i
ls = sorted(ls)
print("%.1f" % ((median(ls[len(ls)//2:]) if len(ls)%2 == 0 else median(ls[(len(ls)//2)+1:])) - median(ls[:len(ls)//2])))