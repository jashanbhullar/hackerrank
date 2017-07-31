from itertools import product
A = list(map(int , input().split()))
B = list(map(int , input().split()))
print(' '.join(map(str , product(A,B))))