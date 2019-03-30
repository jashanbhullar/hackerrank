from statistics import pstdev
n = int(input())
print("%.1f" % (pstdev(list(map(int,input().split())))))