from common import fileio
from common import words

def main():
	fileio.FILE_ADDRESS = "../../res/problem022/names.txt"
	names = fileio.readFileAsStrList(sep=',', quotes=True)
	scoreSum = 0
	names.sort()
	for i, name in enumerate(names):
		scoreSum += (i+1) * words.wordSum(name)
	print(scoreSum)

if __name__ == "__main__":
	main()
