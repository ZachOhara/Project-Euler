from common import mathutil

def main():
	count = 0
	for exp in range(1, 200):
		#if exp % 10 == 0: print(exp)
		for base in range(1, 200):
			if len(str(base ** exp)) == exp:
				#print(base ** exp, exp)
				count += 1
	print(count)
		

if __name__ == "__main__":
	main()
