from common import mathutil

def main():
	done = False
	for a in range(1, 998):
		for b in range(1, 999 - a):
			if mathutil.isPythagorean([a, b, 1000 - a - b]):
				print(a * b * (1000 - a - b))
				done = True
				break
		if done:
			break

if __name__ == '__main__':
	main()