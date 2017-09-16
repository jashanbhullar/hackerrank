import statistics as st
n , X , Y = int(input()) , list(map(float, input().split())) , list(map(float , input().split()))
rankx = {v : k+1 for k,v in enumerate(sorted(X))}
ranky = {v : k+1 for k,v in enumerate(sorted(Y))}
print(round(1 - 6 * sum([(rankx[x]-ranky[y])**2 for x,y in zip(X,Y)])/(n*((n**2) -1)),3))