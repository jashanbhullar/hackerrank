n, a , b = int(input()), list(map(int , input().split())) , list(map(int , input().split()))
print("%.1f" % (sum([x * y for x,y in zip(a,b)])/sum(b)))