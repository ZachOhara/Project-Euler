from common import factors
from common import trianglenums

def main():
	for i in trianglenums.triangleNumbers():
		#if i % 1000 == 0:
			#print(i)
		if len(factors.factorsOf(i)) > 500:
			print(i)
			break

if __name__ == '__main__':
	main()