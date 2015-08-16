
def main():
	print(checkMultiplesOf(360360, 20))
	
def checkMultiplesOf(n, div):
	i = n
	while not isDivisibleByAll(i, div):
		i += n
	return i

def isDivisibleByAll(n, div):
	for i in range(2, div + 1):
		if n % i != 0:
			return False
	return True

if __name__ == '__main__':
	main()