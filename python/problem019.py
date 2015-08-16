
def main_OLD():
	firstSundays = 0
	weekday = 1
	month = 1
	year = 1900
	while year < 2001:	
		if weekday == 0 and year >= 1901:
			firstSundays += 1
		month += 1
		year += int(month / 12)
		month %= 12
		weekday += getDaysInMonth(month, year)
		weekday %= 7
	print(firstSundays)

def main():
	firstSundays = 0
	weekday = 1
	day = 1
	month = 1
	year = 1900
	while year < 2001:	
		if day == 1 and weekday == 0 and year >= 1901:
			firstSundays += 1
		day += 1
		weekday += 1
		weekday %= 7
		if day > getDaysInMonth(month, year):
			day = 1
			month += 1
			if month > 12:
				year += 1
				month = 1
	print(firstSundays)
	
def getDaysInMonth(month, year):
	if month in (9, 4, 6, 11):
		return 30
	elif month == 2:
		if year % 4 == 0:
			if year % 100 == 0 and not year % 400 == 0:
				return 28
			else:
				return 29
		else:
			return 28
	else:
		return 31

if __name__ == '__main__':
	main()