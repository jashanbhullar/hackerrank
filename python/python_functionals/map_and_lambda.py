cube = lambda x : x**3 # complete the lambda function 

def fibonacci(n):
	ls = []
	if n == 0:
		return ls
	ls = [0]
	if(n == 1):
		return ls
	ls.append(1)
	for i in range (2,n):
		ls.append(ls[i-1]+ls[i-2])
	return ls
    # return a list of fibonacci numbers

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))