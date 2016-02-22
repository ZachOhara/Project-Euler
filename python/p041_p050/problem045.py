from common import hexagonalnums
from common import pentagonalnums
from common import trianglenums

def main():
	for h in hexagonalnums.hexagonalNumbers():
		if h > 40755 and pentagonalnums.isPentagonal(h) and trianglenums.isTriangleNum(h):
			print(h)
			break

if __name__ == "__main__":
	main()
