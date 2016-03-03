import math

def main():
	#print([factorialDigitSum(i) for i in (145, 169, 363601, 1454)])
	#print(set(buildChain(69)))
	count = 0
	for i in range(1000000):
		if i % 1000 == 0: print(i)
		if len(buildChain(i, 61)) == 60:
			count += 1
	print(count)
		
def buildChain(n, max):
	chain = [n]
	for i in range(max):
		next = factorialDigitSum(chain[-1])
		if next in chain:
			return chain
		chain.append(next)
	return chain
		
def factorialDigitSum(n):
	return sum([math.factorial(int(i)) for i in str(n)])
		
if __name__ == "__main__":
	main()
