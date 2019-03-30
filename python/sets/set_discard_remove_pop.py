n = int(input())
s = set(map(int, input().split())) 
n = int(input())
for i in range(n):
	try:
		cm , o = input().split(' ')
		eval('s'+'.'+cm+'('+o+')')
	except KeyError:
		continue
	except ValueError:
		try:
			s.pop()
		except KeyError:
			continue

print(sum(s))