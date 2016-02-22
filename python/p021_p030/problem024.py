import itertools

def main():
	perm = "0123456789"
	result = list(itertools.permutations(perm))[999999]
	print(''.join(result))
	
if __name__ == "__main__":
	main()