import itertools

def main():
	#print(permutations(41063625))
	#print([isCube(i) for i in [41063625, 56623104, 66430125]])
	#print(hasCubicPermutations(41063625, 3))
	i = 1
	while not hasCubicPermutations(i ** 3, 5):
		i += 1
		print(i)
	print(i, i ** 3)
	
def hasCubicPermutations(n, p):
	cubesCount = 0
	for i in set(permutations(n)):
		if isCube(i):
			cubesCount += 1
			#print(i, isCube(i), int(round(i ** (1 / 3))))
	if cubesCount == p:
		return True
	#print(cubesCount)
	return False

def isCube(n):
	root = int(round(n ** (1 / 3)))
	return root ** 3 == n
	
def permutations(n):
	return [int("".join(i)) for i in itertools.permutations(str(n))]

if __name__ == "__main__":
	main()
