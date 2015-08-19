
def main():
	print(str(seriesTo(1000))[-10:])

def seriesTo(n):
	return sum([i ** i for i in range(1, n+1)])

if __name__ == "__main__":
	main()
