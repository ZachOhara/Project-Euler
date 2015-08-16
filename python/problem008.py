
FILE_ADDRESS = "../res/problem008/series.txt"

def main():
	series = generateSeries()
	print(max(adjProducts(series, 13)))

def generateSeries():
	series = []
	for line in open(FILE_ADDRESS, 'r'):
		for char in line[:-1]:
			series.append(int(char))
	return series

def adjProducts(series, adj):
	productList = []
	for i in range(len(series) - adj):
		product = 1
		for j in range(adj):
			product *= series[i+j]
		productList.append(product)
	return productList
	
if __name__ == '__main__':
	main()