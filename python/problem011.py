
FILE_ADDRESS = "../res/problem011/grid.txt"

def main():
	ADJ = 4
	matrix = generateMatrix()
	products = []
	products.extend(checkVertical(matrix, ADJ))
	products.extend(checkHorizontal(matrix, ADJ))
	products.extend(checkDiagonal(matrix, ADJ))
	products.extend(checkReverseDiagonal(matrix, ADJ))
	print(max(products))

def generateMatrix():
	matrix = []
	for line in open(FILE_ADDRESS, 'r'):
		row = []
		for num in line[:-1].split(' '):
			row.append(int(num))
		matrix.append(row)
	return matrix

def checkVertical(matrix, adj):
	productList = []
	for i in range(len(matrix) - adj):
		for j in range(len(matrix[i])):
			product = 1
			for row in range(adj):
				product *= matrix[i + row][j]
			productList.append(product)
	return productList

def checkDiagonal(matrix, adj):
	productList = []
	for i in range(len(matrix) - adj):
		for j in range(len(matrix[i]) - adj):
			product = 1
			for pos in range(adj):
				product *= matrix[i + pos][j + pos]
			productList.append(product)
	return productList

def checkReverseDiagonal(matrix, adj):
	productList = []
	for i in range(len(matrix) - 1, -1, -1):
		for j in range(len(matrix[i]) - adj):
			product = 1
			for pos in range(adj):
				product *= matrix[i - pos][j + pos]
			productList.append(product)
	return productList

def checkHorizontal(matrix, adj):
	productList = []
	for i in range(len(matrix)):
		for j in range(len(matrix[i]) - adj):
			product = 1
			for col in range(adj):
				product *= matrix[i][j + col]
			productList.append(product)
	return productList

if __name__ == '__main__':
	main()