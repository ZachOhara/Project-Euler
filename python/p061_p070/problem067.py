from common import fileio

from p011_p020 import problem018

# This problem uses the same code as problem 18

def main():
	fileio.FILE_ADDRESS = "../../res/problem067/triangle.txt"
	print(problem018.getMaxSum(fileio.readFileAsMatrix()))

if __name__ == "__main__":
	main()
