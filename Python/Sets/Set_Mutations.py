n = int(input())
st = set(map(int,input().split()))
n = int(input())
for i in range(n):
	op , d = input().split(' ')
	opSet = set(map(int,input().split()))
	eval('st.'+op+'(opSet)')
print(sum(st))