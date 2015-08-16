import common.MathUtil as MathUtil

def main():
	for i in MathUtil.generateTriangleNumbers():
		#if i % 100 == 0:
			#print(i)
		if len(MathUtil.factorsOf(i)) > 500:
			print(i)
			break

if __name__ == '__main__':
	main()