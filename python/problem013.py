from common import fileio

def main():
	fileio.FILE_ADDRESS = "../res/problem013/numbers.txt"
	nums = fileio.readFileAsList()
	print(str(sum(nums))[:10])

if __name__ == '__main__':
	main()