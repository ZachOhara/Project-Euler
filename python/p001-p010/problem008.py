from common import fileio

def main():
	fileio.FILE_ADDRESS = "../../res/problem008/series.txt"
	series = fileio.readFileAsSequence()
	print(max(adjProducts(series, 13)))

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