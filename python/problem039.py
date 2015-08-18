from common import mathutil

def main():
	#print(solutionsForPerimeter(120))
	START = 3
	numSols = []
	for i in range(START, 1001):
		if not i % 10 and i > 0: print(i, max(numSols), numSols.index(max(numSols)) + START)
		numSols.append(solutionsForPerimeter(i))
	print(numSols.index(max(numSols)) + START)

def solutionsForPerimeter(p):
	sols = []
	for a in range(1, p - 1):
		for b in range(1, p - a):
			triple = [a, b, p - a - b]
			triple.sort()
			if mathutil.isPythagorean(triple[:]) and triple not in sols:
				sols.append(triple)
				#print(triple)
	return len(sols)

if __name__ == "__main__":
	main()
