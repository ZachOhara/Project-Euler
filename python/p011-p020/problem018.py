from common import fileio

def main():
	fileio.FILE_ADDRESS = "../../res/problem018/triangle.txt"
	print(getMaxSum(fileio.readFileAsMatrix()))

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