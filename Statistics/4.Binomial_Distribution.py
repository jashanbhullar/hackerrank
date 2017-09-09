import math
def nCr(n,r):
    f = math.factorial
    return (f(n)//(f(r)*f(n-r)))
def b(n,x,p):
    return nCr(n,x)*(p**x)*(1-p)**(n-x)
p , q = map(float,input().split())
p = p/(p+q)
print(round(sum([b(6,i,p) for i in range(3,7)]),3))