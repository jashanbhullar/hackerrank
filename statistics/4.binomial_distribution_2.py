import math
def nCr(n,r):
    f = math.factorial
    return (f(n)//(f(r)*f(n-r)))
def b(n,x,p):
    return nCr(n,x)*(p**x)*(1-p)**(n-x)
p , q = map(float,input().split())
print(round(sum([b(10,i,0.12) for i in range(0,3)]),3))
print(round(sum([b(10,i,0.12) for i in range(2,11)]),3))