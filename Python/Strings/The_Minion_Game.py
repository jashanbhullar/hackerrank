def minion_game(s):
	ls = 'AEIOU'
	a = 0
	b = 0 
	n = len(s)
	for i in range(0,n):
		val = n - i
		if ls.find(s[i]) == -1:
			a += val 
		else:
			b += val
	if a > b:
		print('Stuart',a)
	elif b > a:
		print('Kevin',b)
	else:
		print('Draw')
s = input()
minion_game(s)