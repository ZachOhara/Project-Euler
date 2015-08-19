from common import pentagonalnums

def main():
	print("Stop the program manually when updates stop coming frequently...")
	mindiff = None
	for a in pentagonalnums.pentagonalNumbers():
		for b in pentagonalnums.pentagonalNumsTo(a):
			s = a + b
			d = a - b
			if (d < mindiff if mindiff else True) and pentagonalnums.isPentagonal(s) and pentagonalnums.isPentagonal(d):
				mindiff = d
				print(a, b, d)
				
if __name__ == "__main__":
	main()
