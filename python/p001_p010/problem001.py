
def main():
	print(sumMultiplesOf(3, 5, 1000))
	
def sumMultiplesOf(a, b, cap):
	s = 0
	for i in range(cap):
		if i % a == 0 or i % b == 0:
			s += i
	return s

if __name__ == "__main__":
	main()