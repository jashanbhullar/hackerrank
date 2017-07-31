dt = dict()
for a in input():
	try :
		dt[a] += 1
	except KeyError:
		dt[a] = 1
def fun(x):
	val = 0
	lt = ''
	for a in sorted(x):
		if x[a] > val :
			lt = a
			val = dt[a]
	x.pop(lt)
	print(lt,val)
fun(dt)
fun(dt)
fun(dt)