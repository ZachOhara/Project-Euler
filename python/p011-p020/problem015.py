
# TODO: Write a better solution to this problem.
# This problem is easily solved on paper, but this solution takes
# wayy too long to run ( >4 hours)

def main():
	print(paths(20))

def paths(size):
	return pathsFrom(0, 0, size)

def pathsFrom(x, y, size):
	print("(", x, y, ")")
	if x == size and y == size:
		return 1
	paths = 0
	if x < size:
		paths += pathsFrom(x + 1, y, size)
	if y < size:
		paths += pathsFrom(x, y + 1, size)
	return paths

if __name__ == '__main__':
	main()