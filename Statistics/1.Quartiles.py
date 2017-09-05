from statistics import median
n , ls = int(input()) , sorted(list(map(int, input().split())))
print(int(median(ls[:n//2])))
print(int(median(ls)))
print(int(median(ls[n//2:]))) if n%2 == 0 else print(int(median(ls[(n//2)+1:])))