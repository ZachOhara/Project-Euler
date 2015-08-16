
FILE_ADDRESS = "../res/problem018/triangle.txt"

def main():
	print(getMaxSum(generateTriangle()))

def generateTriangle():
	triangle = []
	for line in open(FILE_ADDRESS, 'r'):
		row = []
		for num in line[:-1].split(' '):
			row.append(int(num))
		triangle.append(row)
	return triangle

def getMaxSum(triangle):
	sums = [[None] * len(line) for line in triangle]
	sums[-1] = triangle[-1]
	for i in range(len(triangle) -1, 0, -1):
		assimilateSums(i-1, sums, triangle)
	return sums[0][0]

def assimilateSums(level, sums, triangle):
	for i in range(len(sums[level])):
		bestPath = max([sums[level+1][i], sums[level+1][i+1]])
		sums[level][i] = bestPath + triangle[level][i]

if __name__ == "__main__":
	main()