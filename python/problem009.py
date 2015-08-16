
def main():
	for a in range(1, 998):
		for b in range(1, 999 - a):
			if isPythagorean([a, b, 1000 - a - b]):
				print(a * b * (1000 - a - b))
	
def isPythagorean(itr):
	if len(itr) != 3:
		return False
	c = max(itr)
	itr.remove(c)
	a, b, = itr
	return a ** 2 + b ** 2 == c ** 2

if __name__ == '__main__':
	main()