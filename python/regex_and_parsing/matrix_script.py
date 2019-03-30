import re
ar = []
n , m = map(int ,input().split())
for i in range(n):
	ar.append(input())
val = ""
for i in range(m):
	for j in range(n):
		try:
			val += ar[j][i]
		except Exception:
			val += " "
	#print(val)
#print(val)
pt = re.compile(r"(?<=\w)\s*[!@#$%&]+\s*(?=\w)")
m = pt.search(val)
while m:
	val = pt.sub(' ',val)
	m = pt.search(val)
print(val)